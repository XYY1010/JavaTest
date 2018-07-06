package com.xyy.test10;

class FailingConstructor {
	public FailingConstructor() throws ConstructionException {
		throw new ConstructionException();
	}
}

public class Exercise1222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FailingConstructor f = new FailingConstructor();
		} catch (ConstructionException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	
	}

}
