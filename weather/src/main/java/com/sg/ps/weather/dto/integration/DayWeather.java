package com.sg.ps.weather.dto.integration;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DayWeather {

	private Long dt;
	private Main main;
	private List<Weather> weather;
	private Wind wind;
	private String dt_txt;
}
