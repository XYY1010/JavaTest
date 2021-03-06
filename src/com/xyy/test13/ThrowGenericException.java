package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;


interface Processor<T, E extends Exception> {
	void process(List<T> resultCollector) throws E;
}

class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {
	List<T> processAll() throws E {
		List<T> resultCollector = new ArrayList<T>();
		for (Processor<T, E> processor: this) {
			processor.process(resultCollector);
		}
		return resultCollector;
	}
}

class Failure1 extends Exception {}

class Processor1 implements Processor<String, Failure1> {
	static int count = 3;
	public void process(List<String> resultCollector) throws Failure1 {
		if (count-- > 1) {
			resultCollector.add("Hep!");
		} else {
			resultCollector.add("Ho!");
		}
		if (count < 0) {
			throw new Failure1();
		}
	}
}

class Failure2 extends Exception {}

class Processor2 implements Processor<Integer, Failure2> {
	static int count = 2;
	public void process(List<Integer> resultCollector) throws Failure2 {
		if (count-- == 0) {
			resultCollector.add(47);
		} else {
			resultCollector.add(11);
		}
		if (count < 0) {
			throw new Failure2();
		}
	}
}

public class ThrowGenericException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessRunner<String,Failure1> runner = new ProcessRunner<String, Failure1>();
		for (int i = 0; i < 3; i++) {
			runner.add(new Processor1());
		}
		try {
			System.out.println(runner.processAll());
		} catch (Failure1 e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		ProcessRunner<Integer, Failure2> runner2 = new ProcessRunner<Integer, Failure2>();
		for (int i = 0; i < 3; i++) {
			runner2.add(new Processor2());
		}
		try {
			System.out.println(runner2.processAll());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
