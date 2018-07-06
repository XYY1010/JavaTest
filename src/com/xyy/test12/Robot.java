package com.xyy.test12;

import java.util.List;

import com.xyy.tools.Null;
import com.xyy.tools.Print;

import static com.xyy.tools.Print.*;

public interface Robot {
	String name();
	String model();
	List<Operation> operations();
	class Test {
		public static void test(Robot r) {
			if (r instanceof Null) {
				print("[Null Robot]");
			}
			print("Robot name: " + r.name());
			print("Robot model: " + r.model());
			for (Operation operation : r.operations()) {
				print(operation.description());
				operation.command();
			}
		}
	}
}
