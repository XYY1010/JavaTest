package com.xyy.test15;

import java.util.ArrayList;
import java.util.List;

class StringContainer {
	private String[] array;
	private int index;
	private static final int INCR = 255;
	public StringContainer() {
		array = new String[10];
	}
	public StringContainer(int size) {
		array = new String[size];
	}
	public void add(String s) {
		if (index >= array.length) {
			String[] tmp = new String[array.length + INCR];
			for (int i = 0; i < array.length; i++) {
				tmp[i] = array[i];
			}
			index = array.length;
			array = tmp;
		}
		array[index++] = s;
	}
	public String get(int i) { return array[i]; }
	public int size() { return index; }
}

public class Exercise1731 {
	static final int LOOPS = 10000;
	static List<Test<List<String>>> alTests = new ArrayList<Test<List<String>>>();
	static List<Test<StringContainer>> scTests = new ArrayList<Test<StringContainer>>();
	static {
		alTests.add(new Test<List<String>>("addget") {
			
			@Override
			int test(List<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				for(int i = 0; i < LOOPS; i++) {
					container.add(Integer.toString(i));
					container.get(i);
				}
				return LOOPS;
			}
		});
		scTests.add(new Test<StringContainer>("addget") {
			
			@Override
			int test(StringContainer container, TestParam tp) {
				// TODO Auto-generated method stub
				for (int i = 0; i < LOOPS; i++) {
					container.add(Integer.toString(i));
					container.get(i);
				}
				return LOOPS;
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Parameters are also hard-coded inside tests:
		Tester.defaultParams = TestParam.array(LOOPS, 1);
		Tester.run(new ArrayList<String>(), alTests);
		Tester.run(new StringContainer(LOOPS), scTests);
	}

}
