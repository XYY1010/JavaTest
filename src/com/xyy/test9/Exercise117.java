package com.xyy.test9;

import static com.xyy.tools.Print.*;
import java.util.ArrayList;
import java.util.List;

class Su {
	private static int count = 0;
	private int id = count + 1;
	public Su() {
		count++;
	}
	public int getId() {
		return id;
	}
}

public class Exercise117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Su> suList = new ArrayList<Su>(10);
		for (int i = 0; i < 10; i++) {
			suList.add(new Su());
		}
		List<Su> sub = suList.subList(1, 7);
		
		for(Su s : suList) {
			printnb(s.getId() + ", ");
		}
		print();
		for(Su s : sub) {
			printnb(s.getId() + ", ");
		}
		print();
		suList.removeAll(sub);
		for(Su s : suList) {
			printnb(s.getId() + ", ");
		}
	}

}
