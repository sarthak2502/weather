package com.sg.ps.weather.dto.integration.weathers;

import com.sg.ps.weather.predict.WeatherType;

public class WeatherConditionFactory {

	public static WeatherCondition getWeatherCondition(WeatherType type) {
		
		if (WeatherType.Rain.equals(type)) {
			return new RainyWeather();
		} else if (WeatherType.Clouds.equals(type)) {
			return new CloudyWeather();
		} else if (WeatherType.Snow.equals(type)) {
			return new SnowyWeather();
		} else if (WeatherType.Thunderstorm.equals(type)) {
			return new ThunderWeather();
		}
		//TODO implement other weather types
		
		return new ClearWeather();
	}
}
