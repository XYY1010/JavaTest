package com.xyy.test12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static com.xyy.tools.Print.*;

class MethodSelector implements InvocationHandler {

	private Object proxied;
	
	public MethodSelector(Object proxied) {
		// TODO Auto-generated constructor stub
		this.proxied = proxied;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if (method.getName().equals("interesting")) {
			print("Proxy detected the interesting method");
		}
		return method.invoke(proxied, args);
	}
	
}

interface SomeMethods {
	void boring1();
	void boring2();
	void interesting(String arg);
	void boring3();
}

class Implementation implements SomeMethods {
	public void boring1() { print("boring1"); }
	public void boring2() { print("boring2"); }
	public void interesting(String arg) {
		print("interesting " + arg);
	}
	public void boring3() {
		print("boring3");
	}
}

public class SelectingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(), new Class[] {SomeMethods.class}, new MethodSelector(new Implementation()));
		proxy.boring1();
		proxy.boring2();
		proxy.interesting("boom");
		proxy.boring3();
	}

}
