package com.xyy.test3;

class CDefaultConstruction{
	public CDefaultConstruction() {
		// TODO Auto-generated constructor stub
		System.out.println("Message1");
	}
	public CDefaultConstruction(String str) {
		System.out.println("Message2:°°" + str);
	}
}

public class DefaultConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDefaultConstruction cDefaultConstruction = new CDefaultConstruction();
		CDefaultConstruction cDefaultConstruction2 = new CDefaultConstruction("÷ÿ‘ÿππ‘Ï∆˜");
	}

}
