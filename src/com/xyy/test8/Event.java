package com.xyy.test8;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}
	public void start() {	// Allows restarting
		eventTime = System.nanoTime() + delayTime;	// System.nanoTime()���ص������뼶ʱ�䣬��ǰʱ��
	}
	public boolean ready() {	// ��ʱ��������action()�����������ڵ������и���ready()������ʹ��Event�ܹ�����ʱ��������������ض�����
		return System.nanoTime() >= eventTime;
	}
	public abstract void action();
}
