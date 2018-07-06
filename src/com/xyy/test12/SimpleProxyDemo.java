package com.xyy.test12;

import static com.xyy.tools.Print.*;

interface Interface {
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		print("doSomething");
	}

	@Override
	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		print("somethingElse " + arg);
	}
	
}

class SimpleProxy implements Interface {
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		print("SimpleProxy doSomething");
		proxied.doSomething();
	}
	@Override
	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		print("SimpleProxy somethingElse " + arg);
		proxied.somethingElse(arg);
	}
	
}

public class SimpleProxyDemo {
	
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("boom");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}

}
