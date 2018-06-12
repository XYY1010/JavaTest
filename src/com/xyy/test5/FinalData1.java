package com.xyy.test5;

import static com.xyy.tools.Print.*;

class SelfCounter{
	private static int count;
	private int id = count++;
	public String toString() {
		return "SelfCounter" + id;
	}
}

class FinalTest{
	final SelfCounter sf = new SelfCounter();
	static final SelfCounter scsf = new SelfCounter();
	public String toString() {
		return "scf = " + sf + "\nscsf = " + scsf; 
	}
}

public class FinalData1 {
	// 因为类装载初始化了static final类型的变量，所以在两次创建FinalTest
	// 实例时都具有相同的值，而常规的final的值在每一个实例中都是不同的。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("First object:");
		print(new FinalTest());
		print("Second object:");
		print(new FinalTest());
	}

}
