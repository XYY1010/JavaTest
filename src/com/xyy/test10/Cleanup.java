package com.xyy.test10;

import static com.xyy.tools.Print.*;

public class Cleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputFile in = new InputFile("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test10/Cleanup.java");
			try {
				String s;
				int i = 1;
				while ((s = in.getLine()) != null) {
					; // Perform line-by-line processing here...
				}
			} catch (Exception e) {
				// TODO: handle exception
				print("Caught Exception in main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch (Exception e) {
			// TODO: handle exception
			print("InputFile construction failed");
		}
	}

}
