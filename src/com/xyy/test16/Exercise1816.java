package com.xyy.test16;

import java.io.IOException;
import java.io.RandomAccessFile;

import static com.xyy.tools.Print.*;

public class Exercise1816 {
	static String file = "Exercise1816.dat";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		RandomAccessFile rf = new RandomAccessFile(file, "rw");
		rf.writeBoolean(false);
		rf.writeByte(3);
		rf.writeChar('c');
		rf.writeDouble(3.1415926);
		rf.writeFloat(1.414f);
		rf.writeLong(1231231231);
		rf.writeInt(123);
		rf.writeUTF("She just a girl");
		rf.writeShort(111);
		rf = new RandomAccessFile(file, "r");
		print(rf.readBoolean());
		print(rf.readByte());
		print(rf.readChar());
		print(rf.readDouble());
		print(rf.readFloat());
		print(rf.readLong());
		print(rf.readInt());
		print(rf.readUTF());
		print(rf.readShort());
	}

}
