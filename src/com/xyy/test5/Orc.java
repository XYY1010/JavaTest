package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Villian{
	private String name;
	protected void set(String nm) { name = nm; }
	public Villian(String name){ this.name = name; }
	public String toString(){
		return "I'm a Villain and my name is " + name;
	}
}

public class Orc extends Villian {
	
	private int orcNumber;
	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber){
		set(name);	// Available because it's protected
		this.orcNumber = orcNumber;
	}
	
	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc orc = new Orc("Limburger", 12);
		print(orc);
		orc.change("Bob", 19);
		print(orc);
	}

}
