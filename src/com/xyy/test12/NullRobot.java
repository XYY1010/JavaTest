package com.xyy.test12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

import com.xyy.tools.Null;

class NullRobotProxyHandler implements InvocationHandler {

	private String nullName;
	private Robot proxied = new NRobot();
	public NullRobotProxyHandler(Class<? extends Robot> type) {
		// TODO Auto-generated constructor stub
		nullName = type.getSimpleName() + " NullRobot";
	}
	
	private class NRobot implements Null, Robot {
		public String name() { return nullName; }
		public String model() { return nullName; }
		public List<Operation> operations() {
			return Collections.emptyList();
		}
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return method.invoke(proxied, args);
	}
	
}

public class NullRobot {

	public static Robot newNullRobot(Class<? extends Robot> type) {
		return (Robot)Proxy.newProxyInstance(NullRobot.class.getClassLoader(), new Class[] { Null.class, Robot.class }, new NullRobotProxyHandler(type));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] bots = { new SnowRemovalRobot("SnowBee"), newNullRobot(SnowRemovalRobot.class) };
		for (Robot robot : bots) {
			Robot.Test.test(robot);
		}
	}

}
