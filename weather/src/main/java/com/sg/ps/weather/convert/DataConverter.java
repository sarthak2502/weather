package com.sg.ps.weather.convert;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public interface DataConverter<S, T> extends Converter<S, T> {
	default List<T> convertAll(List<S> sources) {
		List<T> targets = new ArrayList<>();
		for (S source : sources) {
			T target = convert(source);
			targets.add(target);
		}
		return targets;
	}
}