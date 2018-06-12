package com.xyy.test5;

import static com.xyy.tools.Print.*;

public class NewDetergent extends Detergent {
	
	public void scrub(){
		append(" NewDetergent.scrub");
		super.scrub();
	}
	
	public void sterilize(){
		append(" sterilize()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewDetergent newDetergent = new NewDetergent();
		newDetergent.dilute();
		newDetergent.apply();
		newDetergent.scrub();
		newDetergent.foam();
		newDetergent.sterilize();
		print(newDetergent);
	}

}
