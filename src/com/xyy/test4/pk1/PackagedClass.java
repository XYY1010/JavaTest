package com.xyy.test4.pk1;

import com.xyy.tools.Print;

//编译不能通过，因为PackagedClass类的访问权限是默认的，不同包，不能访问。
/*class PackagedClass {
	public PackagedClass(){
		Print.print("Creating a packaged class");
	}
}*/
public class PackagedClass {
	public PackagedClass(){
		Print.print("Creating a packaged class");
	}
}
