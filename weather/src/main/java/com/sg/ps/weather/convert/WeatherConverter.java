package com.sg.ps.weather.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.sg.ps.weather.dto.CityWeather;
import com.sg.ps.weather.dto.HourlyWeather;
import com.sg.ps.weather.dto.integration.DayWeather;
import com.sg.ps.weather.dto.integration.WeatherResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class WeatherConverter implements DataConverter<WeatherResponse, CityWeather> {

	@Override
	public CityWeather convert(WeatherResponse source) {
		CityWeather target = new CityWeather();
		
		target.setCity(source.getCity().getName());
		List<HourlyWeather> lstDays = new ArrayList<>();
		source.getList().forEach((DayWeather day) -> lstDays.add(HourlyWeather.build(day)));
		Map<String, List<HourlyWeather>> map = lstDays.stream().collect(Collectors.groupingBy(HourlyWeather::getDay));
        Map<String, List<HourlyWeather>> sorted = new TreeMap<>();
        sorted.putAll(map);
		target.setDays(sorted);

		log.debug("{}", target);
		return target;
	}
	
}