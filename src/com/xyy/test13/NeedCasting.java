package com.xyy.test13;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class NeedCasting {
	@SuppressWarnings("unchecked")
	public static void f(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		List<Widget> shapes = (List<Widget>)in.readObject();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"/Users/xyy/Downloads/信息工程毕业生合影/42张12.7cmX17.8cm.JPG", "sdasd", "sads"};
		try {
			f(strs);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
