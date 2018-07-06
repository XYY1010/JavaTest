package com.xyy.test10;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException2 {
	
	private static Logger logger = Logger.getLogger("LoggerException2");
	
	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			// TODO: handle exception
			logException(e);
		}
	}
}
