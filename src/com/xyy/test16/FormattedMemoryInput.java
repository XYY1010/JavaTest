package com.xyy.test16;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/FormattedMemoryInput.java").getBytes()));
			while (true) {
				System.out.println((char)in.readByte());
			}
		} catch (EOFException e) {
			// TODO: handle exception
			System.err.println("End of stream");
		}

	}

}
