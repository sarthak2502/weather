package com.sg.ps.weather.dto.integration;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Builder
@Data
public class WeatherResponse {

	private List<DayWeather> list;
	private City city;
}
