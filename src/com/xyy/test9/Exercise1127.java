package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.LinkedList;
import java.util.Queue;


public class Exercise1127 {

	class Command {
		private String str;
		public Command(String str) {
			this.str = str;
		}
		public void operation() {
			print("str = " + str);
		}
	}
	
	class QueueFill {
		public Queue method() {
			Queue<Command> q = new LinkedList<Command>();
			q.add(new Command("as"));
			q.add(new Command("pfdgs"));
			q.add(new Command("fsdggr"));
			q.add(new Command("bcfbt"));
			return q;
		}
	}
	
	class QueueConsume{
		private Queue<Command> q;
		public QueueConsume(Queue q) {
			this.q = q;
		}
		public void consume() {
			while (q.peek() != null) {
				Command c = q.poll();
				c.operation();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1127 e = new Exercise1127();
		QueueFill qf = e.new QueueFill();
		QueueConsume qc = e.new QueueConsume(qf.method());
		qc.consume();
		
	}

}
