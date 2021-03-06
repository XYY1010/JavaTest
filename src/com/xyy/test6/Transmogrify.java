package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Actor {
	public void act() {}
}

class HappyActor extends Actor {
	public void act() { print("HappyActor"); }
}

class SadActor extends Actor {
	public void act() { print("SadActor"); }
}

class Stage {
	private Actor actor = new HappyActor();
	public void change() { actor = new SadActor(); }
	public void performPlay() { actor.act(); }
}

public class Transmogrify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}

}
