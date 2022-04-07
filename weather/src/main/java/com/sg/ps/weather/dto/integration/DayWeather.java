package com.sg.ps.weather.dto.integration;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Builder
@Data
public class DayWeather {

	private Long dt;
	private Main main;
	private List<Weather> weather;
	private Wind wind;
	private String dt_txt;
}
