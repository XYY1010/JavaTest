package com.xyy.test4.pk2;

import com.xyy.test4.pk1.Cookie;
import com.xyy.tools.Print;

public class ChocolateChip2 extends Cookie {

	public ChocolateChip2(){
		Print.print("ChocolateChip2 constructor");
	}
	
	public void chomp() {	//Protected method
		bite();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateChip2 x = new ChocolateChip2();
		x.chomp();
	}

}
