package com.sg.ps.weather.dto.integration;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class City {

	private String name;
	private String country;
}
