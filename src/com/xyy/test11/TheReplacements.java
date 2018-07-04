package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xyy.tools.TextFile;

/*! Here's a block of text to use as input to
 *  the regular expression matcher. Note that we'll
 *  first extract the block of text by looking for
 *  the special delimiters, then process the 
 *  extracted block. !*/

// 这里有一个文本块作为输入
//	正则表达式匹配器。请注意,我们将
//	首先通过查找提取文本块
//	特殊的分隔符，然后处理
//	提取块。

public class TheReplacements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = TextFile.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test11/TheReplacements.java");
		Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(s);
		if (mInput.find()) {
			s = mInput.group(1);
		}
		s = s.replaceAll(" {2,}", " ");
		print(s);
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		StringBuffer sbuf = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher(s);
		while (m.find()) {
			m.appendReplacement(sbuf, m.group().toUpperCase());
		}
		m.appendTail(sbuf);
		print(sbuf);
	}

}
