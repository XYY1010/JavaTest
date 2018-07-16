package com.xyy.test15;

import static com.xyy.tools.Print.*;

class Link<T> {
	public Link<T> next;
	public T data;
	public Link(T t , Link<T> next) {
		this.data = t;
		this.next = next;
	}
	public Link(T t) {
		// TODO Auto-generated constructor stub
		this(t, null);
	}
	public String toString() {
		if (data == null) {
			return "null";
		}
		return data.toString();
	}
	
}

class SList<T> {
	private Link<T> headLink = new Link<T>(null);
	public String toString() {
		if (headLink.next == null) {
			return "SList: []";
		}
		printnb("SList: [");
		StringBuffer sb = new StringBuffer();
		String s = ""; //new
		SListIterator<T> sit = this.iterator();
		while (sit.hasNext()) {
			sb.append(sit.next() + (sit.hasNext() ? ", " : ""));
			s = sb.toString(); // new 
		}
		sb.append("]");
		return sb.toString();
	}
	public SListIterator<T> iterator() {
		return new SListIterator<T>(headLink);
	}
}

class SListIterator<T> {
	Link<T> current;
	public SListIterator(Link<T> link) {
		// TODO Auto-generated constructor stub
		this.current = link;
	}
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return current.next != null ;
	}

	public Link<T> next() {
		// TODO Auto-generated method stub
		current = current.next;
		return current.next;
	}

	public void remove() {
		// TODO Auto-generated method stub
		if (current.next != null) {
			current.next = current.next.next;
		}
	}

	public void insert(T t) {
		current.next = new Link<T>(t, current.next);
		current = current.next;
	}
	
}

public class Exercise1708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SList<String> slist = new SList<String>();
		print(slist);
		SListIterator<String> sit = slist.iterator();
		sit.insert("abc");
		print(slist);
		// sit = slist.iterator();
		sit.insert("aac");
		print(slist);
	} 

}
