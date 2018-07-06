package com.xyy.test10;

/*
 * 如果RuntimeException没有被捕获而直达main()，那么在程序退出前将调用
 * 异常的printStackTrace()方法
 */

public class NeverCaught {

	static void f() {
		throw new RuntimeException("From f()");
	}
	
	static void g() {
		f();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		g();
	}

}

/*Exception in thread "main" java.lang.RuntimeException: From f()
at com.xyy.test10.NeverCaught.f(NeverCaught.java:7)
at com.xyy.test10.NeverCaught.g(NeverCaught.java:11)
at com.xyy.test10.NeverCaught.main(NeverCaught.java:16) */
