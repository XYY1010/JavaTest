package com.xyy.test8;

import static com.xyy.tools.Print.*;



public class Exercise1016 {

	interface Cycle {
		void ride();
		int wheels();
	}

	interface CycleFactory {
		Cycle getCycle();
	}

	static class Unicycle implements Cycle {
		private Unicycle() {}

		@Override
		public void ride() {
			// TODO Auto-generated method stub
			print("Unicycle.ride()");
		}

		@Override
		public int wheels() {
			// TODO Auto-generated method stub
			return 1;
		}
		
		public static CycleFactory factory = new CycleFactory() {
			
			@Override
			public Cycle getCycle() {
				// TODO Auto-generated method stub
				return new Unicycle();
			}
		};
		
	}

	static class Bicycle implements Cycle {

		private Bicycle() {}
		
		@Override
		public void ride() {
			// TODO Auto-generated method stub
			print("Bicycle.ride()");
		}

		@Override
		public int wheels() {
			// TODO Auto-generated method stub
			return 2;
		}
		
		public static CycleFactory factory = new CycleFactory() {
			
			@Override
			public Cycle getCycle() {
				// TODO Auto-generated method stub
				return new Bicycle();
			}
		};
	}

	static class Tricycle implements Cycle {

		private Tricycle() {}
		
		@Override
		public void ride() {
			// TODO Auto-generated method stub
			print("Tricycle.ride()");
		}

		@Override
		public int wheels() {
			// TODO Auto-generated method stub
			return 3;
		}
		
		public static CycleFactory factory = new CycleFactory() {
			
			@Override
			public Cycle getCycle() {
				// TODO Auto-generated method stub
				return new Tricycle();
			}
		};
		
	}
	
	public static void rideBike(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.ride();
		print("wheels:" + c.wheels());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rideBike(Unicycle.factory);
		rideBike(Bicycle.factory);
		rideBike(Tricycle.factory);
	}	

}
