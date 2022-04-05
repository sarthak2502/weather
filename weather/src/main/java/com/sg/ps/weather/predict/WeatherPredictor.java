package com.sg.ps.weather.predict;

import com.sg.ps.weather.dto.integration.DayWeather;
import com.sg.ps.weather.dto.integration.weathers.WeatherCondition;
import com.sg.ps.weather.dto.integration.weathers.WeatherConditionFactory;

public class WeatherPredictor {

	/**
	 * Method to calculate general predictions
	 * Further calls for getting weather condition specific prediction.
	 * 
	 * @param dayWeather
	 * @return Prediction message
	 */
	public static String getPrediction(DayWeather dayWeather) {
		StringBuilder sb = new StringBuilder();
		if (dayWeather.getMain().getTemp() > 40) {
			sb.append("A sunny day. Use sunscreen lotion. ");
		}
		if (dayWeather.getWind().getSpeed() > 3) {
			sb.append("Watch Out! It's too windy! ");
		}
		WeatherCondition condition = WeatherConditionFactory.getWeatherCondition(dayWeather.getWeather().get(0).getMain());
		sb.append(condition.calculatePrediction(dayWeather));
		
		return sb.toString();
	}

}
