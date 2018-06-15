package com.xyy.test9;

import java.util.PriorityQueue;

class SimpleClass extends Object {}

public class Exercise1129 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<SimpleClass> pq = new PriorityQueue<SimpleClass>();
		pq.offer(new SimpleClass());
		pq.offer(new SimpleClass());
		pq.offer(new SimpleClass());
		pq.offer(new SimpleClass());
		pq.offer(new SimpleClass());
		pq.offer(new SimpleClass());
		// Error Information: Exception in thread "main" java.lang.ClassCastException: com.xyy.test9.SimpleClass cannot be cast to java.lang.Comparable
		// at java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:652)
		// at java.util.PriorityQueue.siftUp(PriorityQueue.java:647)
		// at java.util.PriorityQueue.offer(PriorityQueue.java:344)
		// at com.xyy.test9.Exercise1129.main(Exercise1129.java:13)
	}

}
