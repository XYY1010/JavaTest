package com.xyy.test12;

import static com.xyy.tools.Print.print;

class MCandy {
	static { print("Loading MCandy"); }
}

class MGum {
	  static { print("Loading MGum"); }
}

class MCookie {
	static { print("Loading MCookie"); }
}

public class Exercise1407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 1) {
			print("Please input Class");
			System.exit(0);
		}
		if (args[0].equals(MCandy.class.getSimpleName())) {
			new MCandy();
		}
		if (args[0].equals(MGum.class.getSimpleName())) {
			new MGum();
		}
		if (args[0].equals(MCookie.class.getSimpleName())) {
			new MCookie();
		}
	}

}
