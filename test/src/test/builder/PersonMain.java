package test.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main (String[] args) {

		Person p1 = new Person("Sarthak", "Goel");
		Person p2 = new Person("Aadi", "Kumar");
		
		List<Person> l = new ArrayList<>();
		
		l.add(p1);
		l.add(p2);
		
		//Collections.sort(l);
		
		System.out.println(l);
	}
}
