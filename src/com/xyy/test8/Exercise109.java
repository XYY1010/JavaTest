package com.xyy.test8;

public class Exercise109 {

	public Destination destination (String s) {
		class IDestination implements Destination {
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
		return new IDestination(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise109 exercise109 = new Exercise109();
		Destination ds = exercise109.destination("Losangeles");
		System.out.println(ds.readLabel());
	}

}
