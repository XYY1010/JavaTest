package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Shared1 {
	private int refcount = 0;
	private static long counter = 0;	//对所有shared对象只有一份的计数器
	private final long id = counter++;	//final，不希望id的值在对象生命周期中被改变
	public Shared1() {
		print("Creating" + this);
	}
	public void addRef() {	//该方法用来记住shared被多少个对象作为成员对象使用
		refcount++;
	}
	protected void dispose() {
		if (--refcount == 0) { //当不再有Composing对象持有同一个shared对象，可以dispose()
			print("Disposing" + this);
		}
	}
	@Override
	public String toString() {
		return "Shared" + id;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(--refcount != 0){
			return;
		}else{
			super.finalize();
		}
	}
	public int getRefcount() {	//用于外界获取shared当前的状态
		return refcount;
	}
}

class Composing1 {
	private Shared1 shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing1(Shared1 shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();	//每有一个Composing使用了某个shared，就给其加1计数
	}
	protected void dispose() {
		print("dispose" + this);
		shared.dispose();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Composing" + id;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if (shared.getRefcount() != 0) {
			print("Can not finalize now");
			return;
		}else {
			print("Finalize now");
			super.finalize();
		}
	}
}

public class Exercise813 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared1 shared = new Shared1();
		Composing1[] composing1 = new Composing1[]{
				new Composing1(shared), new Composing1(shared),
				new Composing1(shared), new Composing1(shared),
				new Composing1(shared), new Composing1(shared)
		};
		for (Composing1 c : composing1) {
			c.dispose();
			try {
				c.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.gc();
	}

}
