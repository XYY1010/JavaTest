package com.xyy.test11;

public class DatabaseException extends Exception {

	public DatabaseException(int transactionID, int queryID, String message) {
		super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new DatabaseException(3, 7, "Write failed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
