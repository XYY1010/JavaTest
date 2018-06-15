package com.xyy.test9;

import java.util.Map;
import static com.xyy.tools.Print.*;

public class EnvironmentVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Map.Entry entry : System.getenv().entrySet()) {
			print(entry.getKey() + ": " + entry.getValue());
		}
	}

}
