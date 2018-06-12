package com.xyy.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test21 test21 = new Test21();
		System.out.println(test21.get_num());
		System.out.println(test21.get_ch());
		
		ATypeName aTypeName = new ATypeName();
		aTypeName.printName();
		
		DataOnly dataOnly = new DataOnly();
		dataOnly.i = 47;
		dataOnly.d = 1.1;
		dataOnly.b = false;
		System.out.println(dataOnly.i);
		
		CStorage cStorage = new CStorage();
		int storage = cStorage.storage("苏");
		System.out.println(storage);
		
		Incrementable incrementable = new Incrementable();
		incrementable.increment();
		System.out.println(incrementable.getI());
		
		StaticTest test1 = new StaticTest(1, 'a');	//创建多个实例
		StaticTest test2 = new StaticTest(2, 'b');
		System.out.println("test1-"+test1.j+test1.a+test1.x);
		System.out.println("test2-"+test2.j+test2.a+test2.x);
		
		AutoPackageTest auto = new AutoPackageTest();
		auto.printRes();
	}
}
