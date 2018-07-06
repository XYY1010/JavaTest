package com.xyy.test13;

public class Exercise1505<T> {
	
	private class Node {
		T item;
		Node next;
		public Node() {
			item = null;
			next = null;
		}
		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	
	private Node top = new Node();
	
	public void push(T item) {
		top = new Node(item, top); 
	}
	
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1505<String> lss = new Exercise1505<String>();
		for (String string : "I'm superhero, I want to save the world!".split(" ")) {
			lss.push(string);
		}
		String s;
		while((s = lss.pop()) != null) {
			System.out.println(s);
		}
	}

}
