package com.xyy.test15;

public class Groundhog2 extends Groundhog {

	public Groundhog2(int n) { super(n); }
	public int hashCode() { return number; }
	public boolean equals(Object o) {
		return o instanceof Groundhog2 && (number == ((Groundhog2)o).number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
