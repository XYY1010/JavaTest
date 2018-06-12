package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mill m = new Mill();
		Grain g = m.process();
		print(g);
		m = new WheatMill();
		g = m.process();
		print(g);
	}

}
