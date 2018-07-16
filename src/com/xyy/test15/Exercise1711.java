package com.xyy.test15;

import java.util.PriorityQueue;

import static com.xyy.tools.Print.*;

class IntPQueue extends PriorityQueue<IntPQueue.IntPQueueItem> {
	static class IntPQueueItem implements Comparable<IntPQueueItem> {
		private int i;
		
		public IntPQueueItem(int i) {
			this.i = i;
		}
		
		@Override
		public int compareTo(IntPQueueItem o) {
			// TODO Auto-generated method stub
			return (i < o.i ? -1 : (i == o.i ? 0 : 1));
		}
		
		public String toString() {
			return Integer.toString(i);
		}
	}
	public void add(int i) {
		super.add(new IntPQueueItem(i));
	}
}

public class Exercise1711 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPQueue ipq = new IntPQueue();
		ipq.add(1);
		ipq.add(2);
		ipq.add(19);
		ipq.add(4);
		ipq.add(12);
		while (!ipq.isEmpty()) {
			printnb(ipq.poll() + " ");
		}
	}

}
