package com.xyy.test3;

class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkIn(){
		checkedOut = true;
	}
	protected void finalize(){
		if (checkedOut) {
			System.out.println("Error: checked out");
		}
	}
}

public class TerminationCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}

}
