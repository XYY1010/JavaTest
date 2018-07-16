package com.xyy.test13;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ClassCasting {
	@SuppressWarnings("unchecked")
	public void f(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		List<Widget> shapes = (List<Widget>)in.readObject();
		// Won't compile:
		// List<Widget> lw1 = List<Widget>.class.cast(in.readObject());
		List<Widget> lw2  = List.class.cast(in.readObject());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
