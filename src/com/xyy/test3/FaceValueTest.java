package com.xyy.test3;

public class FaceValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FaceValue fv = FaceValue.FIFTY;
		for(FaceValue fv1 : FaceValue.values())
			System.out.println(fv1 + ", ordinal " + fv1.ordinal());
		
		System.out.print("The FaceValue is ");
		switch (fv) {
		case ONE:
			System.out.println("One Yuan");
			break;

		case FIVE:
			System.out.println("Five Yuan");
			break;
			
		case TEN:
			System.out.println("Ten Yuan");
			break;
			
		case TWENTY:
			System.out.println("Twenty Yuan");
			break;
			
		case FIFTY:
			System.out.println("Fifty Yuan");
			break;
			
		case HUNDRED:
			System.out.println("One Hundred Yuan");
			break;
			
		default:
			break;
		}
		
	}

}
