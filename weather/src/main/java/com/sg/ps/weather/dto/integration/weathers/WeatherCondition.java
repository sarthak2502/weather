package com.sg.ps.weather.dto.integration.weathers;

import com.sg.ps.weather.dto.integration.DayWeather;

public interface WeatherCondition {

	String calculatePrediction(DayWeather weatherCondition);
}
