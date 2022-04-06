package com.sg.ps.weather.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Utility {
	public static final String LOCAL_DATE_PATTERN = "yyyy-MM-dd";
	public static final String LOCAL_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static final Random RAND = new Random();

	public static String getStringDate(LocalDate date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(LOCAL_DATE_PATTERN);
		return dtf.format(date);
	}

	public static LocalDate getLocalDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(LOCAL_DATE_PATTERN);
		return LocalDate.parse(date, formatter);
	}

	public static String getStringDate(LocalDateTime date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(LOCAL_DATE_TIME_PATTERN);
		return dtf.format(date);
	}

	public static LocalDateTime getLocalDateTime(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(LOCAL_DATE_TIME_PATTERN);
		return LocalDateTime.parse(date, formatter);
	}

	public static Double getRandomNumber(int min, int max) {
		Integer num = RAND.nextInt((max - min) + 1) + min;
		return num.doubleValue();
	}
	
}