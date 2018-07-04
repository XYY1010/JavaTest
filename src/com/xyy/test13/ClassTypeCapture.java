package com.xyy.test13;

class Building {}
class House extends Building {}

public class ClassTypeCapture<T> {

	Class<T> kind;
	public ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTypeCapture<Building> cttb = new ClassTypeCapture<Building>(Building.class); 
		System.out.println(cttb.f(new Building()));
		System.out.println(cttb.f(new House()));
		ClassTypeCapture<House> ctth = new ClassTypeCapture<House>(House.class);
		System.out.println(ctth.f(new Building()));
		System.out.println(ctth.f(new House()));
	}

}
