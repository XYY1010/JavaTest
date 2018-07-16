package com.xyy.test13;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

interface ProcessorTest<T, E extends Exception, F extends Exception> {
	void process(List<T> resultCollector) throws E, F;
}

class ProcessRunnerTest<T, E extends Exception, F extends Exception> extends ArrayList<ProcessorTest<T, E, F>> {
	List<T> processAll() throws E, F {
		List<T> resultCollector = new ArrayList<T>();
		for (ProcessorTest<T, E, F> processorTest : this) {
			processorTest.process(resultCollector);
		}
		return resultCollector;
	}
}

class Failure3 extends Exception{}

class Processor1Test implements ProcessorTest<String, Failure1, Failure3> {
	static int count = 3;
	public void process(List<String> resultCollector) throws Failure1, Failure3 {
		if (count-- > 1) {
			resultCollector.add("Hep!");
		} else {
			resultCollector.add("Ho!");
		}
		if (count < 0 && count > -1) {
			throw new Failure1();
		}
		if (count < -1) {
			throw new Failure3();
		}
	}
}

class Failure4 extends Exception {}

class Processor2Test implements ProcessorTest<Integer, Failure2, Failure4> {
	static int count = 2;
	public void process(List<Integer> resultCollector) throws Failure2, Failure4 {
		if (count-- == 0) {
			resultCollector.add(47);
		} else {
			resultCollector.add(11);
		}
		if (count < 0 && count > -1) {
			throw new Failure2();
		} 
		if (count < -1) {
			throw new Failure4();
		}
	}
}

public class Exercise1536 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessRunnerTest<String, Failure1, Failure3> runner = new ProcessRunnerTest<String, Failure1, Failure3>();
		for (int i = 0; i < 3; i++) {
			runner.add(new Processor1Test());
		}
		try {
			System.out.println(runner.processAll());
		} catch (Failure1 e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Failure3 e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		ProcessRunnerTest<Integer, Failure2, Failure4> runner2 = new ProcessRunnerTest<Integer, Failure2, Failure4>();
		for (int i = 0; i < 3; i++) {
			runner2.add(new Processor2Test());
		}
		try {
			System.out.println(runner2.processAll());
		} catch (Failure2 e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Failure4 e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
