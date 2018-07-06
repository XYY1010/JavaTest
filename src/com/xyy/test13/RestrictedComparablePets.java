package com.xyy.test13;

class Hamster extends ComparablePet implements Comparable<ComparablePet> {
	public int compareTo(ComparablePet arg) { return 0; } 
}

// Or just:
class Gecko extends ComparablePet {
	public int compareTo(ComparablePet arg) { return 0; } 
}

public class RestrictedComparablePets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
