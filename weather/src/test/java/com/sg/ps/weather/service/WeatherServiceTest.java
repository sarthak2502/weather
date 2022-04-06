package com.sg.ps.weather.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

import com.sg.ps.weather.convert.WeatherConverter;
import com.sg.ps.weather.data.MockData;
import com.sg.ps.weather.data.WeatherMockData;
import com.sg.ps.weather.dto.CityWeather;
import com.sg.ps.weather.dto.HourlyWeather;
import com.sg.ps.weather.dto.integration.City;
import com.sg.ps.weather.dto.integration.DayWeather;
import com.sg.ps.weather.dto.integration.WeatherResponse;

@SpringBootTest
@TestPropertySource("classpath:application.properties")
class WeatherServiceTest {

	@Value("${weather.url}")
	private String weatherUrl;

	@Mock
	private RestTemplate restTemplate;

	@Mock
	private WeatherConverter weatherConverter;

	@InjectMocks
	private WeatherService weatherService = new WeatherService();

	@Test
    void checkRainyWeather() {
		String city = "london";
		CityWeather expected = new CityWeather(); 
		expected.setCity(city);
		List<HourlyWeather> hourlyWeathers = new ArrayList<>();
		hourlyWeathers.add(MockData.getRainyEvent(0));
		Map<String, List<HourlyWeather>> map = new HashMap<>();
		map.put(hourlyWeathers.get(0).getDay(), hourlyWeathers);
		expected.setDays(map);
		
		List<DayWeather> weathers = new ArrayList<>();
		weathers.add(WeatherMockData.getRainyEvent(0));
		WeatherResponse weatherResponse = WeatherResponse.builder().city(City.builder().name(city).build()).list(weathers).build();
		ResponseEntity<WeatherResponse> resEnt = new ResponseEntity<WeatherResponse>(weatherResponse, HttpStatus.OK);
		ReflectionTestUtils.setField(weatherService, "weatherUrl", weatherUrl);
		Mockito.when(restTemplate.exchange(weatherUrl.concat(city), HttpMethod.GET, null, WeatherResponse.class)).thenReturn(resEnt);
		Mockito.when(weatherConverter.convert(resEnt.getBody())).thenReturn(convert(weatherResponse));

		CityWeather actual = weatherService.checkWeather(city);
		String actualInfo = actual.getDays().get(hourlyWeathers.get(0).getDay()).get(0).getInfo();
		String expectedInfo = expected.getDays().get(hourlyWeathers.get(0).getDay()).get(0).getInfo();
		
		assertNotEquals(-1, actualInfo.indexOf(expectedInfo));
    }

	private CityWeather convert(WeatherResponse source) {
		CityWeather target = new CityWeather();
		
		target.setCity(source.getCity().getName());
		List<HourlyWeather> lstDays = new ArrayList<>();
		source.getList().forEach((DayWeather day) -> lstDays.add(HourlyWeather.build(day)));
		Map<String, List<HourlyWeather>> map = lstDays.stream().collect(Collectors.groupingBy(HourlyWeather::getDay));
        Map<String, List<HourlyWeather>> sorted = new TreeMap<>();
        sorted.putAll(map);
		target.setDays(sorted);

		return target;
	}

}
