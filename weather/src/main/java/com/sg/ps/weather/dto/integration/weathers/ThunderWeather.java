package com.sg.ps.weather.dto.integration.weathers;

import com.sg.ps.weather.dto.integration.DayWeather;

public class ThunderWeather implements WeatherCondition {

	@Override
	public String calculatePrediction(DayWeather weatherCondition) {

		return "Don’t step out! A Storm is brewing!";
	}


}
