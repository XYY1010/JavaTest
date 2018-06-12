package com.xyy.test7;

interface I1 { void f(); }
interface I2 { int f(int i); }
interface I3 { int f(); }
class CB { public int f() { return 1; } }

class C2 implements I1, I2 {
	public void f() {}
	public int f(int i) { return 1; }	// overloaded
}

class C3 extends CB implements I2 {
	public int f(int i) { return 1; }	// overloaded
}

class C4 extends CB implements I3 {
	// Identical. no problem:
	public int f() { return 1; }
}

// Methods differ only by return type:
//! class C5 extends CB implements I1 {}
//! interface I4 extends I1, I3 {}


/* ��ʱ�������ˣ���Ϊ���ǡ�ʵ�ֺ��������˲���ؽ�����һ�𣬶������ط�����ͨ���������������ֲ����ġ�
 * ������������е�ע��ʱ�����д�����Ϣ��˵����һ��
 * InterfaceCollision.java:23:f() in C cannot implement f() in I1;attempting to use incompatible return type
 * found:int
 * required:void
 * InterfaceCollision.java:24:Interfaces I3 and I1 are incompatible;both
 * define f() but with different return type
 * �ڴ�����ϵĲ�ͬ�ӿ���ʹ����ͬ�ķ�����ͨ������ɴ���ɶ��ԵĻ��ң������������������
 * */

public class InterfaceCollision {

}
