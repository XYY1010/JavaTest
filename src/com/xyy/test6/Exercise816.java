package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Mode {
	public void apply() {}
}

class Subsonic extends Mode {
	public void apply() { print("Subsonic mode applying..."); }
}

class Sonic extends Mode {
	public void apply() { print("Sonic mode applying..."); }
}

class Supersonic extends Mode {
	public void apply() { print("Supersonic mode applying..."); }
}

class Starship{
	private Mode mode = new Sonic();
	public void accelerate() { mode = new Supersonic(); }
	public void decelerate() { mode = new Subsonic(); }
	public void showMode() { mode.apply(); }
}

public class Exercise816 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starship starship = new Starship();
		starship.showMode();
		starship.accelerate();
		starship.showMode();
		starship.decelerate();
		starship.showMode();
	}

}
