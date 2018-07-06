package com.xyy.test10;

import static com.xyy.tools.Print.*;

class NeedsCleanup {	// Construction can't fail
	private static long counter = 1;
	private final long id = counter++;
	public void dispose() {
		print("NeedsCleanup " + id + " disposed");
	}
}

class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
	// Construction can fail:
	public NeedsCleanup2() throws ConstructionException {}
}

public class CleanupIdiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Section 1:
		NeedsCleanup nc1 = new NeedsCleanup();
		try {
			// ...
		} finally {
			// TODO: handle finally clause
			nc1.dispose();
		}
		
		// Section 2:
		// If construction cannot fail you can group objects:
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {
			// ...
		} finally {
			// TODO: handle finally clause
			nc3.dispose(); // Reverse order of construction
			nc2.dispose();
		}
		
		// Section 3:
		// If construction can fail you must guard each one:
		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {
					// ...
				} finally {
					// TODO: handle finally clause
					nc5.dispose();	
				}
			} catch(ConstructionException e) {	// nc5 constructor
				// TODO: handle finally clause
				print(e);
			} finally {
			// TODO: handle exception
				nc4.dispose();
			}
		} catch (ConstructionException e) {	// nc4 constructor
			// TODO: handle exception
			print(e);
		}
	} 

}
