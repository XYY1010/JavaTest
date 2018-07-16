package com.xyy.test16;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("")));
		while (in.available() != 0) {
			System.out.println((char)in.readByte());
		}
	}

}
