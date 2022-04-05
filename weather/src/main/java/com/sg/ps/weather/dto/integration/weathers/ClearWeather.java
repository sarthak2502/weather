package com.sg.ps.weather.dto.integration.weathers;

import com.sg.ps.weather.dto.integration.DayWeather;

public class ClearWeather implements WeatherCondition {

	@Override
	public String calculatePrediction(DayWeather weatherCondition) {
		return "";
	}


}
