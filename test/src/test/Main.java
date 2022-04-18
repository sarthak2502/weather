package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	static class Employee{
		String name;
		String department;
	}
	
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("sarthak", "aadi", "Prash");
		System.out.println(lst.stream().filter(p -> p.length() > 4).map(String::length).collect(Collectors.toList()));
		System.out.println(lst.stream().map(String::length).filter(p -> p > 4).collect(Collectors.toList()));
	}
}
