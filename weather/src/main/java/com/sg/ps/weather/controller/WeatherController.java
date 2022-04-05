package com.sg.ps.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.ps.weather.dto.CityWeather;
import com.sg.ps.weather.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/{city}")
	public ResponseEntity<CityWeather> checkWeather(@PathVariable("city") String city) {
		return ResponseEntity.ok(weatherService.checkWeather(city));
	}
	
}
