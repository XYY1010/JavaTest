package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Homer {
	char doh(char c){
		print("doh(char)");
		return 'd';
	}
	float doh(float f){
		print("doh(float)");
		return 1.0f;
	}
}

class Milhouse {}

class Bart extends Homer {
	void doh(Milhouse m){
		print("doh(Milhouse)");
	}
}

public class Hide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}

}