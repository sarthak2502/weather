package com.sg.ps.weather.dto.integration;

import com.sg.ps.weather.predict.WeatherType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Builder
@Data
public class Weather {

	private WeatherType main;
}
