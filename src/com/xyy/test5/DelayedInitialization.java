package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Simple{
	String s;
	public Simple(String si){
		s = si;
	}
	public String toString(){
		return s;
	}
	public void setString(String sNew){
		s = sNew;
	}
}

class Second{
	Simple simple;
	String s;
	public Second(String si){
		s = si;
	}
	public void checked(){
		if(simple == null){
			print("not initialized");
		}else{
			print("initialized");
		}
	}
	private Simple lazy(){
		if(simple == null){
			print("Creating simple");
			simple = new Simple(s);
		}
		return simple;
	}
	public Simple getSimple(){
		return lazy();
	}
	public String toString(){
		return lazy().toString();
	}
	public void setSimple(String sNew){
		lazy().setString(sNew);
	}
}

public class DelayedInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second second = new Second("Init String");
		second.checked();
		print(second.getSimple());
		second.checked();
		print(second);
		second.setSimple("New String");
		print(second);
	}

}
