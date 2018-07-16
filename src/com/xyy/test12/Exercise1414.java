package com.xyy.test12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part1 {
	public String toString() {
		return getClass().getSimpleName();
	}
	
	static List<Class<? extends Part1>> partFactories = new ArrayList<Class<? extends Part1>>();
	static List<Part1> listParts = new ArrayList<Part1>();
	static {
		listParts.add(new FuelFilter1());
		listParts.add(new AirFilter1());
		listParts.add(new CabinAirFilter1());
		listParts.add(new OilFilter1());
		listParts.add(new FanBelt1());
		listParts.add(new GeneratorBelt1());
		listParts.add(new PowerSteeringBelt1());
	}
	
	private static Random rand = new Random(47);
	public static Part1 createRandom() {
		int n = rand.nextInt(listParts.size());
		return listParts.get(n);
	}
}

class Filter1 extends Part1 {}

class FuelFilter1 extends Filter1 {
	// Create a Class Factory for each specific type:
	public static class Factory implements com.xyy.test12.Factory<FuelFilter1> {
		public FuelFilter1 create() {
			return new FuelFilter1();
		}
	}
}

class AirFilter1 extends Filter1 {
	public static class Factory implements com.xyy.test12.Factory<AirFilter1> {
		public AirFilter1 create() {
			return new AirFilter1();
		}
	}
}

class CabinAirFilter1 extends Filter1 {
	public static class Factory implements com.xyy.test12.Factory<CabinAirFilter1> {
		public CabinAirFilter1 create() {
			return new CabinAirFilter1();
		}
	}
}

class OilFilter1 extends Filter1 {
	public static class Factory implements com.xyy.test12.Factory<OilFilter1> {
		public OilFilter1 create() {
			return new OilFilter1();
		}
	}
}

class Belt1 extends Part1 {}

class FanBelt1 extends Belt1 {
	public static class Factory implements com.xyy.test12.Factory<FanBelt1> {
		public FanBelt1 create() {
			return new FanBelt1();
		}
	}
}

class GeneratorBelt1 extends Belt1 {
	public static class Factory implements com.xyy.test12.Factory<GeneratorBelt1> {
		public GeneratorBelt1 create() {
			return new GeneratorBelt1();
		}
	}
}

class PowerSteeringBelt1 extends Belt1 {
	public static class Factory implements com.xyy.test12.Factory<PowerSteeringBelt1> {
		public PowerSteeringBelt1 create() {
			return new PowerSteeringBelt1();
		}
	}
}

public class Exercise1414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Part1.createRandom());
		}
	}

}
