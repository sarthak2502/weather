package com.sg.ps.weather.dto.integration;

import java.util.List;

import lombok.Data;

@Data
public class WeatherResponse {

	private List<DayWeather> list;
	private City city;
}
