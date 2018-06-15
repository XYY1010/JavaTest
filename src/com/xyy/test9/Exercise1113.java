package com.xyy.test9;

import java.util.LinkedList;
import java.util.ListIterator;

import com.xyy.test8.Event;

public class Exercise1113 {

	class ControllerModify {
		private LinkedList<Event> events = new LinkedList<Event>();
		public void addEvent(Event c) { events.addLast(c); }
		public void run() {
			while (events.size() > 0) {
				LinkedList<Event> e = new LinkedList<Event>(events);
				ListIterator<Event> it = e.listIterator();
				while (it.hasNext()) {
					if (it.next().ready()) {
						System.out.println(it.next());
						it.next().action();
						events.remove(it.next());
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
