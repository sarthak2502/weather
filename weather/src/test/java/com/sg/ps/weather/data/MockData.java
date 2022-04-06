package com.sg.ps.weather.data;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.sg.ps.weather.dto.HourlyWeather;
import com.sg.ps.weather.predict.WeatherType;
import com.sg.ps.weather.util.Utility;

public class MockData {

	public static HourlyWeather getRainyEvent(Integer hourOffset) {
		return HourlyWeather.builder()
				.date(Utility.RAND.nextLong())
				.day(Utility.getStringDate(LocalDate.now()))
				.strDate(Utility.getStringDate(LocalDateTime.now().plusHours(hourOffset)))
				.temp(Utility.getRandomNumber(25, 45))
				.type(WeatherType.Rain.name())
				.info("It's a rainy day. Carry an Umbrella.")
				.build();
	}
	
	public static HourlyWeather getThunderEvent(Integer hourOffset) {
		return HourlyWeather.builder()
				.date(Utility.RAND.nextLong())
				.day(Utility.getStringDate(LocalDate.now()))
				.strDate(Utility.getStringDate(LocalDateTime.now().plusHours(hourOffset)))
				.temp(Utility.getRandomNumber(20, 35))
				.type(WeatherType.Thunderstorm.name())
				.info("Don’t step out! A Storm is brewing!")
				.build();
	}

	public static HourlyWeather getCloudEvent(Integer hourOffset) {
		return HourlyWeather.builder()
				.date(Utility.RAND.nextLong())
				.day(Utility.getStringDate(LocalDate.now()))
				.strDate(Utility.getStringDate(LocalDateTime.now().plusHours(hourOffset)))
				.temp(Utility.getRandomNumber(20, 35))
				.type(WeatherType.Clouds.name())
				.info("")
				.build();
	}

	public static HourlyWeather getSnowEvent(Integer hourOffset) {
		return HourlyWeather.builder()
				.date(Utility.RAND.nextLong())
				.day(Utility.getStringDate(LocalDate.now()))
				.strDate(Utility.getStringDate(LocalDateTime.now().plusHours(hourOffset)))
				.temp(Utility.getRandomNumber(20, 35))
				.type(WeatherType.Snow.name())
				.info("")
				.build();
	}

}
