package com.xyy.test8;

import static com.xyy.tools.Print.*;
import com.xyy.example.Interface106;

public class Exercise106 {

	protected class CAchievement implements Interface106 {

		@Override
		public void listener() {
			// TODO Auto-generated method stub
			print("CAchievement.listener()");
		}
		
	}
	
	public CAchievement getAch() {
		return new CAchievement();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
