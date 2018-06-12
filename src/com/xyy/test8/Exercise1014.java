package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Exercise1014 {

	public DangerousMonster getDangerousMonster() {
		return new DangerousMonster() {

			@Override
			public void menace() {
				// TODO Auto-generated method stub
				print("DangerousMonster.menace()");
			}

			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				print("DangerousMonster.destroy()");
			}
			
		};
	}
	
	public Vampire getVampire() {
		return new Vampire() {
			
			@Override
			public void kill() {
				// TODO Auto-generated method stub
				print("Vampire.kill()");
			}
			
			@Override
			public void menace() {
				// TODO Auto-generated method stub
				print("Vampire.menace()");
			}
			
			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				print("Vampire.destory()");
			}
			
			@Override
			public void drinkBlood() {
				// TODO Auto-generated method stub
				print("Vampire.drinkBlood()");
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1014 exercise1014 = new Exercise1014();
		DangerousMonster dm = exercise1014.getDangerousMonster();
		dm.menace();
		dm.destroy();
		Vampire vm = exercise1014.getVampire();
		vm.destroy();
		vm.drinkBlood();
		vm.kill();
		vm.menace();
	}

}

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

