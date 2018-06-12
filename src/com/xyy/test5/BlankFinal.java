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
	private final int j;	//空白final
	private final Poppet p;	//空白final引用
	//空白finals一定要在构造器中初始化
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
