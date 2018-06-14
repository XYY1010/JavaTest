package com.xyy.test8;

class WithInner {
	class Inner {}
}

public class InheritInner extends WithInner.Inner {

	public InheritInner(WithInner wi) {
		// TODO Auto-generated constructor stub
		wi.super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}

}
