package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Shared1 {
	private int refcount = 0;
	private static long counter = 0;	//������shared����ֻ��һ�ݵļ�����
	private final long id = counter++;	//final����ϣ��id��ֵ�ڶ������������б��ı�
	public Shared1() {
		print("Creating" + this);
	}
	public void addRef() {	//�÷���������סshared�����ٸ�������Ϊ��Ա����ʹ��
		refcount++;
	}
	protected void dispose() {
		if (--refcount == 0) { //��������Composing�������ͬһ��shared���󣬿���dispose()
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
	public int getRefcount() {	//��������ȡshared��ǰ��״̬
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
		this.shared.addRef();	//ÿ��һ��Composingʹ����ĳ��shared���͸����1����
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
