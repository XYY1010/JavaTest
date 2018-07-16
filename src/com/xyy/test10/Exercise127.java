package com.xyy.test10;

import static com.xyy.tools.Print.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exercise127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = new int[5];
			for (int i = 0; i < 10; i++) {
				arr[i] = i * i * i;
			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger logger = Logger.getLogger("Exercise127");
			StringWriter trace = new StringWriter();
			e.printStackTrace(new PrintWriter(trace));
			print(trace.toString());
		}
	}

}
