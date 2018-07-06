package com.xyy.test13;

import static com.xyy.tools.Print.*;

class ClassAsFactory<T> {
	T x;
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Employee {}

public class InstantiantiateGenericType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		print("ClassAsFactory<Employee> succeeded");
		try {
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		} catch (Exception e) {	// ClassAsFactory<Integer>s失败，因为Integer没有默认构造函数
			// TODO: handle exception
			print("ClassAsFactory<Integer> failed.");
		}
	}

}
