package com.xyy.test8;



public class Exercise1013 {

	public Destination destination (final String s) {
		/*class IDestination implements Destination {
			private String label;
			public IDestination(String str) {
				label = str;
			}
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		}
		return new IDestination(s);*/
		return new Destination() {
			private String label;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1013 p = new Exercise1013();
		Destination d = p.destination("Tasmania");
	}

}
