package com.sg.ps.weather.dto.integration.weathers;

import com.sg.ps.weather.dto.integration.DayWeather;

public class RainyWeather implements WeatherCondition {

	@Override
	public String calculatePrediction(DayWeather weatherCondition) {

		return "It's a rainy day. Carry an Umbrella.";
	}


}
