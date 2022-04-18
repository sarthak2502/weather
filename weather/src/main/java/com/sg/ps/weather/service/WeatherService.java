package com.sg.ps.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sg.ps.weather.convert.WeatherConverter;
import com.sg.ps.weather.dto.CityWeather;
import com.sg.ps.weather.dto.integration.WeatherResponse;

@Service
public class WeatherService {

	@Value("${weather.url}")
	private String weatherUrl;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WeatherConverter weatherConverter;

	public CityWeather checkWeather(String city) {
		//The rest call can be extracted to a separate service..
		//So that delayed response or down time can be efficiently handled in a microservice env.
		ResponseEntity<WeatherResponse> weatherRes = restTemplate.exchange(weatherUrl.concat(city), HttpMethod.GET, null, WeatherResponse.class);
		return weatherConverter.convert(weatherRes.getBody());
	}

}
