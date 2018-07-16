package com.xyy.test13;

interface SelfBoundSetter<T extends SelfBoundSetter<T>> {
	void set(T arg);
} 

interface Setter extends SelfBoundSetter<Setter> {}

public class SelfBoundingAndCovariantArguments {
	void testA(Setter s1, Setter s2, SelfBoundSetter sbs) {
		s1.set(s2);
		// s1.set(sbs);	// Error
		// set(setter) in SelfBoundSetter<Setter>
		// cannot be applied to (SelfBoundSetter)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
