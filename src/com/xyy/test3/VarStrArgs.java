package com.xyy.test3;

class VarArgsTest{
	VarArgsTest(String... args){
		for(String str : args)
			System.out.print(str + " ");
		System.out.println();
	}
}

public class VarStrArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsTest varArgsTest = new VarArgsTest(new String[]{"A", "B", "C"});
		VarArgsTest varArgsTest2 = new VarArgsTest("one", "two", "three");
	}

}
