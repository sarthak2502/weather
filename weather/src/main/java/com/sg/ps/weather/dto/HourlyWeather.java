package com.sg.ps.weather.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sg.ps.weather.dto.integration.DayWeather;
import com.sg.ps.weather.predict.WeatherPredictor;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class HourlyWeather {

	private Long date;
	private String day;
	private String strDate;
	private Double temp;
	private String type;
	private String info;
	
	public static HourlyWeather build(DayWeather source) {
		return HourlyWeather.builder()
				.date(source.getDt())
				.day(source.getDt_txt().split(" ")[0])
				.strDate(source.getDt_txt())
				.temp(source.getMain().getTemp())
				.type(source.getWeather().get(0).getMain().name())
				.info(WeatherPredictor.getPrediction(source))
				.build();
	}

}
