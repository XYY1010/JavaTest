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
	// ��Ϊ��װ�س�ʼ����static final���͵ı��������������δ���FinalTest
	// ʵ��ʱ��������ͬ��ֵ���������final��ֵ��ÿһ��ʵ���ж��ǲ�ͬ�ġ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("First object:");
		print(new FinalTest());
		print("Second object:");
		print(new FinalTest());
	}

}
