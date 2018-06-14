package com.xyy.test8;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}
	public void start() {	// Allows restarting
		eventTime = System.nanoTime() + delayTime;	// System.nanoTime()返回的是纳秒级时间，当前时间
	}
	public boolean ready() {	// 何时可以运行action()方法，可以在导出类中覆盖ready()方法，使得Event能够基于时间以外的其他因素而触发
		return System.nanoTime() >= eventTime;
	}
	public abstract void action();
}
