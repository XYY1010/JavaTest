package com.xyy.test16;

import java.io.File;
import java.io.IOException;

import com.xyy.tools.BinaryFile;
import com.xyy.tools.Directory;

import static com.xyy.tools.Print.*;

public class Exercise1820 {
	final static byte[] signature = { (byte)202, (byte)254, (byte)186, (byte)190 };	// 十六进制数：ca fe ba be
	public static void DirectoryTree(File root, String regex) throws IOException {
		for (File file : Directory.walk(root.getAbsolutePath(), regex)) {
			boolean flag = true;
			byte[] bs = BinaryFile.read(file);
			for (int i = 0; i < signature.length; i++) {
				if (bs[i] != signature[i]) {
					System.err.println(file + "is corrupt");
					flag = false;
					break;
				}
			}
			if (flag) {
				print(file.getName() + " true!");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		String regex = ".*\\.class";
		try {
			DirectoryTree(file, regex);
		} catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

}
