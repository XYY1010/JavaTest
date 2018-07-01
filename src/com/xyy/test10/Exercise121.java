package com.xyy.test10;

import static com.xyy.tools.Print.*;

public class Exercise121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("Throw a exception");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			print("Here is finally");
		}
	}

}
