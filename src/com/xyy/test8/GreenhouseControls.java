package com.xyy.test8;

public class GreenhouseControls extends Controller {
	private boolean light = false;
	public class LightOn extends Event {
		
		public LightOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			light = true;
		}
		
		public String toString() { return "Light is on"; }
	}
	public class LightOff extends Event {

		public LightOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			light = false;
		}
		
		public String toString() { return "Light is off"; }
	}
	private boolean water = false;
	public class WaterOn extends Event {

		public WaterOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = true;
		}
		
		public String toString() {
			return "Greenhouse water is on";
		}
		
	}
	public class WaterOff extends Event {
		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = false;
		}
		
		public String toString() {
			return "Greenhousewater is off";
		}
	}
	
	private boolean fan = false;
	public class FanOn extends Event {

		public FanOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			fan = true;
		}
		
		public String toString() {
			return "Greenhousefan is on";
		}
	}
	
	public class FanOff extends Event {

		public FanOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			fan = false;
		}
		
		public String toString() {
			return "Greenhousefan is off";
		}
		
	}
	
	private String thermostat = "Day";
	public class ThermostatNight extends Event {

		public ThermostatNight(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Night";
		}
		
		public String toString() {
			return "Thermostat on night setting";
		}
	}
	
	public class ThermostatDay extends Event {

		public ThermostatDay(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Day";
		}
		
		public String toString() {
			return "Thermostat on day setting";
		}
	}
	
	// An example of an action() that inserts a
	// new one of itself into the event list:
	public class Bell extends Event {

		public Bell(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			addEvent(new Bell(delayTime));
		}
		
		public String toString() { return "Bing!"; }
		
	}
	
	public class Restart extends Event {

		private Event[] eventList;
		
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			// TODO Auto-generated constructor stub
			this.eventList = eventList;
			for (Event e : eventList) {
				addEvent(e);
			}
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();		// Rerun this Event
			addEvent(this);
		}
		
		public String toString() {
			return "Restart system";
		}
	}
	
	public static class Terminate extends Event {

		public Terminate(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
		public String toString() {
			return "Terminating";
		}
	}
	
}
