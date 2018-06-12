package com.xyy.test3;

class CFTest{
	private String name;
	CFTest(String name){
		this.name = name;
		System.out.println(name + " Building...");
	}
	protected void finalize(){
		System.out.println(name + " Recyling...");
	}
}

public class FinalizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CFTest test1 = new CFTest("Object1");
		CFTest test2 = new CFTest("Object2");
		CFTest test3 = new CFTest("Object3");
		test1 = null;
		test2 = null;
		test3 = null;
		System.gc();
	}

}
