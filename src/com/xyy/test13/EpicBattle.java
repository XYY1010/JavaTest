package com.xyy.test13;

import java.util.List;

interface SuperPower {}
interface XRayVision extends SuperPower {
	void seeThroughWalls();
}
interface SuperHearing extends SuperPower {
	void hearSubtleNoises();
}
interface SuperSmell extends SuperPower {
	void trackBySmell();
}

class SuperHero<POWER extends SuperPower> {
	POWER power;
	public SuperHero(POWER power) {
		// TODO Auto-generated constructor stub
		this.power = power;
	}
	POWER getPower() { return power; }
}

class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {

	public SuperSleuth(POWER power) {
		super(power); 
		// TODO Auto-generated constructor stub
	}
	void see() { power.seeThroughWalls(); }
}

class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER> {
	public CanineHero(POWER power) {
		// TODO Auto-generated constructor stub
		super(power);
	}
	void hear() { power.hearSubtleNoises(); }
	void smell() { power.trackBySmell(); }
}

class SuperHearSmell implements SuperHearing, SuperSmell {

	@Override
	public void trackBySmell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hearSubtleNoises() {
		// TODO Auto-generated method stub
		
	}
}

class DogBoy extends CanineHero<SuperHearSmell> {
	public DogBoy() {
		// TODO Auto-generated constructor stub
		super(new SuperHearSmell());
	}
}

public class EpicBattle {
	
	// Bounds in generic methods:
	static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero) {
		hero.getPower().hearSubtleNoises();
	}
	
	static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero) {
		hero.getPower().hearSubtleNoises();
		hero.getPower().trackBySmell();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogBoy dogBoy = new DogBoy();
		useSuperHearing(dogBoy);
		superFind(dogBoy);
		// You can do this:
		List<? extends SuperHearing> audioBoys;
		// But you can't do this
		// List<? extends SuperHearing & SuperSmell> dogBoys;
		
	}

}
