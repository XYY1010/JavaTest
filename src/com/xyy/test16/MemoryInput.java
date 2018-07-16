package com.xyy.test16;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringReader in = new StringReader(BufferedInputFile.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/MemoryInput.java"));
		int c;
		while ((c = in.read()) != -1) {		// read()是以 int 形式返回下一字节，因此必须类型转换为 char 才能正确打印
			System.out.println((char)c);
		}
	}

}
