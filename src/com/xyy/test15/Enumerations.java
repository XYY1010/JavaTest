package com.xyy.test15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import com.xyy.tools.Countries;

public class Enumerations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>(Countries.names(10));
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		// Produce an Enumeration from a Collection:
		e = Collections.enumeration(new ArrayList<String>());
	}

}
