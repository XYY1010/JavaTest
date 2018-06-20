package com.xyy.test10;

import static com.xyy.tools.Print.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;


class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			// TODO: handle exception
			System.err.println("Caught " + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			// TODO: handle exception
			System.err.println("Caught " + e);
		}
	}

}
