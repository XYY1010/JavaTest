package com.xyy.test16;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.xyy.tools.Print.*;

public class Exercise1815 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream out = new DataOutputStream(new FileOutputStream("Data.txt"));
		out.writeInt(47);
		out.writeByte(3);
		out.writeBoolean(false);
		out.writeDouble(3.1415926);
		out.writeLong((long)1231243423);
		out.writeUTF("if you are wolf");
		out.writeChar('c');
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
		print(in.readInt());
		print(in.readByte());
		print(in.readBoolean());
		print(in.readDouble());
		print(in.readLong());
		print(in.readUTF());
		print(in.readChar());
	}

}
