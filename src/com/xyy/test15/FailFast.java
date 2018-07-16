package com.xyy.test15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("An object");
		try {
			String s = it.next();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
