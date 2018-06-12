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


/* 此时困难来了，因为覆盖、实现和重载令人不快地搅在了一起，而且重载方法仅通过返回类型是区分不开的。
 * 当撤销最后两行的注释时，下列错误消息就说明了一切
 * InterfaceCollision.java:23:f() in C cannot implement f() in I1;attempting to use incompatible return type
 * found:int
 * required:void
 * InterfaceCollision.java:24:Interfaces I3 and I1 are incompatible;both
 * define f() but with different return type
 * 在打算组合的不同接口中使用相同的方法名通常会造成代码可读性的混乱，尽量避免这种情况。
 * */

public class InterfaceCollision {

}
