package com.xyy.test10;

import static com.xyy.tools.Print.*;

class FailingConstructor1 {
	private static long counter = 1;
	private final long id = counter++;
	public FailingConstructor1() throws ConstructionException {}
	public void dispose() {
		print("FailingConstructor " + id + " disposed");
	}
}

public class Exercise1223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FailingConstructor1 f1 = new FailingConstructor1();
			try {
				FailingConstructor1 f2 = new FailingConstructor1();
				try {
					// ...
				} finally {
					// TODO: handle finally clause
					f2.dispose();
				}
			} catch (ConstructionException e) {
				// TODO: handle exception
				print(e);
			} finally {
				f1.dispose();
			}
		} catch (ConstructionException e) {
			// TODO: handle exception
			print(e);
		}
		
	}

}
