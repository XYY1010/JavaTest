package com.xyy.test11;

import java.util.Formatter;

public class Receipt {
	private double total = 0;
	private int width = 15;
	private Formatter f = new Formatter(System.out);
	
	public void printTitle() {
		f.format("%"+(-width)+"s %"+(width-10)+"s %10s\n", "Item", "Qty", "Price");
		f.format("%"+(-width)+"s %"+(width-10)+"s %10s\n", "----", "---", "-----");
	}
	
	public void print(String name, int qty, double price) {
		f.format("%-15.15s %"+(width-10)+"d %10.2f\n", name, qty, price);
		total +=  price;
	}
	

	public void printTotal() {
		f.format("%"+(-width)+"s %"+(width-10)+"s %10.2f\n", "Tax", "", total*0.06);
		f.format("%"+(-width)+"s %"+(width-10)+"s %10s\n", "", "", "-----");
		f.format("%"+(-width)+"s %"+(width-10)+"s %10.2f\n", "Total", "", total*1.06);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}

}
