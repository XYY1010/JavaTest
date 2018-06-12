package com.xyy.test5;

import static com.xyy.tools.Print.*;

public class DetergentDelegation {
	
	private String s = "";
	private CleanserDelegation cleanser = new CleanserDelegation();
	
	public DetergentDelegation() { s = cleanser.toString(); }
	
	//delegation method:
	public void append(String a) { s += a;}
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" appply()"); }
	public void scrub() { append(" DetergentDelegation.scrub()"); }
	public void foam() { append(" foam()"); }
	public String toString() { return s; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetergentDelegation delegation = new DetergentDelegation();
		delegation.dilute();
		delegation.apply();
		delegation.scrub();
		delegation.foam();
		print(delegation);
	}

}
