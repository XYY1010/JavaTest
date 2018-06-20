package com.xyy.test10;

import static com.xyy.tools.Print.*;

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Catch the exact type:
		try {
			throw new Sneeze();
		} catch (Sneeze s) {
			// TODO: handle exception
			print("Caught Sneeze");
		} catch (Annoyance a) {
			// TODO: handle exception
			print("Caught Annoyance");
		}
		
		// Catch the base type:
		try {
			throw new Sneeze();
		} catch (Annoyance a) {
			// TODO: handle exception
			print("Caught Annoyance");
		}

	}

}
