package com.xyy.test12;

import java.util.ArrayList;

import static com.xyy.tools.Print.*;

public class Staff extends ArrayList<Position> {

	public void add (String title, Person person) {
		add(new Position(title, person));
	}
	
	public void add (String... titles) {
		for (String string : titles) {
			add(new Position(string));
		}
	}
	
	public Staff(String... titles) {
		add(titles);
	}
	
	public boolean positionAvailable(String title) {
		for (Position pos : this) {
			if (pos.getTitle().equals(title) && pos.getPerson() == Person.NULL) {
				return true;
			}
		}
		return false;
	} 
	
	public void fillPosition(String title, Person hire) {
		for (Position pos : this) {
			if (pos.getTitle().equals(title) && pos.getPerson() == Person.NULL) {
				pos.setPerson(hire);
				return;
			}
		}
		throw new RuntimeException("Position " + title + " not available");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staff = new Staff("President", "CTO",
			      "Marketing Manager", "Product Manager",
			      "Project Lead", "Software Engineer",
			      "Software Engineer", "Software Engineer",
			      "Software Engineer", "Test Engineer",
			      "Technical Writer");
		staff.fillPosition("President", new Person("Me", "Last", "The Top, Lonely At"));
		staff.fillPosition("Project Lead", new Person("Janet", "Planner", "The Burbs"));
		if (staff.positionAvailable("Software Engineer")) {
			staff.fillPosition("Software Engineer", new Person("Bob", "Coder", "Bright Light City"));
		}
		print(staff);
	}

}
