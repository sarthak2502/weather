package com.sg.ps.weather.dto.integration;

import com.sg.ps.weather.predict.WeatherType;

import lombok.Data;

@Data
public class Weather {

	private WeatherType main;
}
