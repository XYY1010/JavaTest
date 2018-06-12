package com.xyy.test1;

import java.awt.print.Printable;

class Dog{
	String name;
	String says;
}

public class CDog {

	static void print(Dog d){
		System.out.println(d.name + " : \""+ d.says + "\"");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot = new Dog();
		spot.name = "Spot";
		spot.says = "Ruff!";
		print(spot);
		Dog scruff = new Dog();
		scruff.name = "Scruff";
		scruff.says = "Wurf!";
		print(scruff);
		
		Dog little = spot;
		System.out.println(little == spot);
		System.out.println(little == scruff);
		System.out.println(little.equals(spot));
		System.out.println(little.equals(scruff));
	}
	

}
