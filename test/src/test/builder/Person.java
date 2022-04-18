package test.builder;

import java.util.Comparator;

public class Person implements Comparator<Person>, Comparable<Person> {

	private String fname;
	private String lname;

	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	@Override
	public int compare(Person o1, Person o2) {
		return o1.fname.compareTo(o2.fname);
	}

	@Override
	public int compareTo(Person o) {
		return this.lname.compareTo(o.lname);
	}
	
	@Override
	public String toString() {
		return this.fname + " " + this.lname;
	}
}
