package com.xyy.test;

import static com.xyy.tools.Print.*;
import com.xyy.test7.InterfaceTest;

public class Activity implements InterfaceTest {
	
	public void printFuc() { print("�ӿڲ���!"); }
	public int reAns() { return 100; } 
	public String reStr() { return "�ӿ��ַ���!"; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity activity = new Activity();
		activity.printFuc();
		print(activity.reAns() + activity.reStr());
	}

}
