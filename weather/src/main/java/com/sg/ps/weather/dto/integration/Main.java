package com.sg.ps.weather.dto.integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Builder
@Data
public class Main {

	private Double temp;
	private Integer humidity;
}
