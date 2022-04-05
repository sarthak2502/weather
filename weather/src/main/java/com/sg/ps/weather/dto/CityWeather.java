package com.sg.ps.weather.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class CityWeather {

	private String city;
	private Map<String, List<HourlyWeather>> days;
}
