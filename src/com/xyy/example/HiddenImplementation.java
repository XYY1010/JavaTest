package com.xyy.example;

import java.lang.reflect.Method;

import com.xyy.test12.A;
import com.xyy.test12.HiddenC;

public class HiddenImplementation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getSimpleName());
		// Compile error: cannot find symbol 'C':
		/*if (a instanceof C) {
			C c = (C) a;
			c.g();
		}*/
		
		// Oops! Reflection still alows us to call g();
		callHiddenMethod(a, "g");
		// And even methods that are less accessible!
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
		
	}
	
	public static void callHiddenMethod(Object a, String methodName) throws Exception {
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}

}
