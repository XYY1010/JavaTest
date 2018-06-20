package com.xyy.test10;

import static com.xyy.tools.Print.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingExceptionTest1 {
	private static Logger logger = Logger.getLogger("LoLoggingExceptionTest1");
	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

class LoggingExceptionTest2 {
	private static Logger logger = Logger.getLogger("LoggingExceptionTest2");
	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class Exercise126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			// TODO: handle exception
			LoggingExceptionTest1 l1 = new LoggingExceptionTest1();
			l1.logException(e);
		}
		
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			// TODO: handle exception
			LoggingExceptionTest2 l2 = new LoggingExceptionTest2();
			l2.logException(e);
		}
	}

}
