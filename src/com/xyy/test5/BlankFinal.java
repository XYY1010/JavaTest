package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Poppet {
	private int i;
	public Poppet(int ii) {
		// TODO Auto-generated constructor stub
		i = ii;
	}
	public String toString() {
		return String.valueOf(i);
	}
}

public class BlankFinal {
	private final int i = 0;
	private final int j;	//�հ�final
	private final Poppet p;	//�հ�final����
	//�հ�finalsһ��Ҫ�ڹ������г�ʼ��
	public BlankFinal(){
		j = 1;
		p = new Poppet(1);
	}
	
	public BlankFinal(int x){
		j = x;
		p = new Poppet(x);
	}
	
	public String toString() {
		return "i = " + i + "\nj = " + j + "\np = " + p;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new BlankFinal());
		
		print(new BlankFinal(47));
	}

}
