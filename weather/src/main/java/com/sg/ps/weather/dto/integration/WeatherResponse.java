package com.sg.ps.weather.dto.integration;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WeatherResponse {

	private List<DayWeather> list;
	private City city;
}
