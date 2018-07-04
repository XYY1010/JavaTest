package com.xyy.test12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static com.xyy.tools.Print.*;

class DynamicProxyHandler implements InvocationHandler {

	private	Object proxied;
	public DynamicProxyHandler(Object proxied) {
		// TODO Auto-generated constructor stub
		this.proxied = proxied;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		print("**** proxy: " + proxy.getClass() + ", method: " + method + ", args:" + args);
		// print(proxy);
		if (args != null) {
			for (Object object : args) {
				print(" " + object);
			}
		}
		return method.invoke(proxied, args);
	}
}

public class SimpleDynamicProxy {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("boom");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[] {Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}

}
