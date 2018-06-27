package com.xyy.test11;

import java.math.BigInteger;
import java.util.Formatter;
import static com.xyy.tools.Print.*;

/*
 * 对于boolean基本类型或Boolean对象，其转换结果是对应的true或false。
 * 但是，对于其他类型的参数，只要该参数不为null，那转换的结果就永远是
 * true。即使是数字0，转换结果依然为true，而这在其他语言中(包括C)，
 * 往往转换为false。
 */

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter f = new Formatter(System.out);
		
		char u = 'a';
		print("u = 'a'");
		f.format("s: %s\n", u);
		// f.format("d: %d\n", u);
		f.format("c: %c\n", u);
		f.format("b: %b\n", u);
		// f.format("f: %f\n", u);
		// f.format("e: %e\n", u);
		// f.format("x: %x\n", u);
		f.format("h: %h\n", u);
		
		int v = 121;
		print("v = 121");
		f.format("d: %d\n", v);
		f.format("c: %c\n", v);
		f.format("b: %b\n", v);
		f.format("s: %s\n", v);
		// f.format("f: %f\n", v);
		// f.format("e: %e\n", v);
		f.format("x: %x\n", v);
		f.format("h: %h\n", v);
		
		BigInteger w = new BigInteger("50000000000000");
		print("w = new BigInteger(\"50000000000000\")");
		f.format("d: %d\n", w);
		// f.format("c: %c\n", w);
		// f.format("b: %b\n", w);
		f.format("s: %s\n", w);
		// f.format("f: %f\n", w);
		// f.format("e: %e\n", w);
		f.format("x: %x\n", w);
		f.format("h: %h\n", w);
		
		double x = 179.543;
		print("x = 179.543");
		// f.format("d: %d\n", x);
		// f.format("c: %c\n", x);
		f.format("b: %b\n", x);
		f.format("s: %s\n", x);
		f.format("f: %f\n", x);
		f.format("e: %e\n", x);
		// f.format("x: %x\n", x);
		f.format("h: %h\n", x);
		
		Conversion y = new Conversion();
		print("y = new Conversion()");
		// f.format("d: %d\n", y);
		// f.format("c: %c\n", y);
		f.format("b: %b\n", y);
		f.format("s: %s\n", y);
		// f.format("f: %f\n", y);
		// f.format("e: %e\n", y);
		// f.format("x: %x\n", y);
		f.format("h: %h\n", y);
		
		boolean z = false;
		print("z = false");
		// f.format("d: %d\n", z);
		// f.format("c: %c\n", z);
		f.format("b: %b\n", z);
		f.format("s: %s\n", z);
		// f.format("f: %f\n", z);
		// f.format("e: %e\n", z);
		// f.format("x: %x\n", z);
		f.format("h: %h\n", z);
	}

}
