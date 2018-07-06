package com.xyy.test12;

import com.xyy.tools.Null;

public class Person {

	public final String first;
	public final String last;
	public final String address;
	// etc.
	public Person(String first, String last, String address) {
		this.first = first;
		this.last = last;
		this.address = address;
	}
	
	public String toString() {
		return "Person: " + first + " " + last + " " + address;
	}
	
	public static class NullPerson extends Person implements Null {

		public NullPerson() {
			super("None", "None", "None");
			// TODO Auto-generated constructor stub
		}
		
		public String toString() { return "NullPerson"; }
		
	}
	
	public static final Person NULL = new NullPerson();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
