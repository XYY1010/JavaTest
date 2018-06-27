package com.xyy.test12;

import static com.xyy.tools.Print.*;

class Candy {
	static { print("Loading Candy"); }
}

class Gum {
	  static { print("Loading Gum"); }
}

class Cookie {
	static { print("Loading Cookie"); }
}

public class SweetShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("inside main");
		new Candy();
		print("After creating Candy");
		try {
		     Class.forName("com.xyy.test12.Gum");
		} catch(ClassNotFoundException e) {
		     print("Couldn't find Gum");
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After creating Cookie");
	}

}
