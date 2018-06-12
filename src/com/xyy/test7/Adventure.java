package com.xyy.test7;

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanClimb {
	void climb();
}

class ActionCharacter {
	public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
	public void swim() {}
	public void fly() {}
	public void climb() {}
}

public class Adventure {
	public static void s(CanClimb x) { x.climb(); }
	public static void t(CanFight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
	public static void w(ActionCharacter x) { x.fight(); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero();
		s(h);
		t(h);	// Treat it as a CanFight
		u(h);
		v(h);
		w(h);
	}

}
