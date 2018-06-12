package com.xyy.test7;

import static com.xyy.tools.Print.*;

abstract class AbstractBase {
	public AbstractBase() {
		// TODO Auto-generated constructor stub
		printFuc();
	}
	public abstract void printFuc();
}

class AbstractDerived extends AbstractBase {
	private int num = 100;//加static后有变化
	public void printFuc() { print("Abstract num = " + num); }
}

public class Exercise93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDerived abstractDerived = new AbstractDerived();
		abstractDerived.printFuc();
	}

}
