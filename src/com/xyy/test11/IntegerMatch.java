package com.xyy.test11;

import static com.xyy.tools.Print.*;

public class IntegerMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("-1234".matches("-?\\d+"));
		print("5678".matches("-?\\d+"));
		print("+911".matches("-?\\d+"));
		print("+911".matches("(-|\\+)?\\d+"));
	}
	
	/*
	 * (-|\\+)? 这个正则表达式表示字符串的起始字符可能是一个-或+，或者
	 * 二者皆没有(因为后面跟着？修饰符)。因为字符+在正则表达式中有特殊的
	 * 意义，所以必须使用\\将其转义，使之成为表达式中的一个普通字符。
	 */

}
