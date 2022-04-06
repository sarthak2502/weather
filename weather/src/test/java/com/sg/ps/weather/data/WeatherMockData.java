package com.sg.ps.weather.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.sg.ps.weather.dto.integration.DayWeather;
import com.sg.ps.weather.dto.integration.Main;
import com.sg.ps.weather.dto.integration.Weather;
import com.sg.ps.weather.dto.integration.Wind;
import com.sg.ps.weather.predict.WeatherType;
import com.sg.ps.weather.util.Utility;

public class WeatherMockData {

	public static DayWeather getRainyEvent(Integer hourOffset) {
		List<Weather> lst = new ArrayList<>();
		lst.add(Weather.builder().main(WeatherType.Rain).build());
		return DayWeather.builder()
				.dt(Utility.RAND.nextLong())
				.main(Main.builder().temp(Utility.getRandomNumber(25, 45)).build())
				.weather(lst)
				.wind(Wind.builder().speed(Utility.getRandomNumber(0, 10)).build())
				.dt_txt(Utility.getStringDate(LocalDate.now()))
				.build();
	}
	
	public static DayWeather getCloudEvent(Integer hourOffset) {
		List<Weather> lst = new ArrayList<>();
		lst.add(Weather.builder().main(WeatherType.Clouds).build());
		return DayWeather.builder()
				.dt(Utility.RAND.nextLong())
				.main(Main.builder().temp(Utility.getRandomNumber(25, 45)).build())
				.weather(lst)
				.wind(Wind.builder().speed(Utility.getRandomNumber(0, 5)).build())
				.dt_txt(Utility.getStringDate(LocalDate.now()))
				.build();
	}
	
	public static DayWeather getSnowEvent(Integer hourOffset) {
		List<Weather> lst = new ArrayList<>();
		lst.add(Weather.builder().main(WeatherType.Snow).build());
		return DayWeather.builder()
				.dt(Utility.RAND.nextLong())
				.main(Main.builder().temp(Utility.getRandomNumber(-10, 0)).build())
				.weather(lst)
				.wind(Wind.builder().speed(Utility.getRandomNumber(0, 2)).build())
				.dt_txt(Utility.getStringDate(LocalDate.now()))
				.build();
	}
	
	public static DayWeather getThunderEvent(Integer hourOffset) {
		List<Weather> lst = new ArrayList<>();
		lst.add(Weather.builder().main(WeatherType.Thunderstorm).build());
		return DayWeather.builder()
				.dt(Utility.RAND.nextLong())
				.main(Main.builder().temp(Utility.getRandomNumber(20, 30)).build())
				.weather(lst)
				.wind(Wind.builder().speed(Utility.getRandomNumber(3, 15)).build())
				.dt_txt(Utility.getStringDate(LocalDate.now()))
				.build();
	}

	public static DayWeather getWindEvent(Integer hourOffset) {
		List<Weather> lst = new ArrayList<>();
		lst.add(Weather.builder().main(WeatherType.Atmosphere).build());
		return DayWeather.builder()
				.dt(Utility.RAND.nextLong())
				.main(Main.builder().temp(Utility.getRandomNumber(20, 35)).build())
				.weather(lst)
				.wind(Wind.builder().speed(Utility.getRandomNumber(4, 15)).build())
				.dt_txt(Utility.getStringDate(LocalDate.now()))
				.build();
	}

	public static DayWeather getSunnyEvent(Integer hourOffset) {
		List<Weather> lst = new ArrayList<>();
		lst.add(Weather.builder().main(WeatherType.Clear).build());
		return DayWeather.builder()
				.dt(Utility.RAND.nextLong())
				.main(Main.builder().temp(Utility.getRandomNumber(41, 45)).build())
				.weather(lst)
				.wind(Wind.builder().speed(Utility.getRandomNumber(0, 5)).build())
				.dt_txt(Utility.getStringDate(LocalDate.now()))
				.build();
	}

}
