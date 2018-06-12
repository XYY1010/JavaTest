package com.xyy.test3;

class Tank{
	boolean isEmpty = false;
	Tank(boolean isEmpty){
		this.isEmpty = isEmpty;
		System.out.println("The status is " + (isEmpty?"Empty":"Full"));
	}
	
	void statusChanged(){
		this.isEmpty = true;
	}
	
	protected void finalize(){
		if(!isEmpty){
			System.out.println("Error: The status is Full");
		}
	}
}

public class TankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank(false);
		tank.statusChanged();
		new Tank(false);
		System.gc();
	}

}
