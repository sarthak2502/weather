package com.sg.ps.weather.dto.integration;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Main {

	private Double temp;
	private Integer humidity;
}
