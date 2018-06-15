package com.xyy.test9;

import static com.xyy.tools.Print.*;

public class Exercise1115 {

	public static boolean judge(char c) {
		if ((c>='A' && c <='Z') || (c>='a' && c<='z')) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		char[] cs = str.toCharArray();
		for (int i = 1; i < cs.length; i++) {
			if (judge(cs[i])) {
				if (cs[i-1] == '+') {
					stack.push(cs[i]);
				}
			}else {
				if (cs[i] == '-' && !stack.empty()) {
					printnb(stack.pop());
				}
			}
		}
	}

}
