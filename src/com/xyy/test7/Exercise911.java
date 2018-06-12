package com.xyy.test7;

import static com.xyy.tools.Print.*;
import java.util.Arrays;

class StrMethod {
	private String str;
	
	public StrMethod(String str) {
		this.str = str;
	}
	
	public String displaceChar() {
		char[] cs = str.toCharArray();
		for(int i=0; i<cs.length/2; i++) {
			char c;
			c = cs[i];
			cs[i] = cs[cs.length-1-i];
			cs[cs.length-1-i] = c;
		}
		String strAns = String.valueOf(cs);
		return strAns;
	}
}

class StrMethodAdapter implements Processor1 {

	StrMethod strMethod = new StrMethod("dasdas");
	
	public StrMethodAdapter(StrMethod strMethod) {
		// TODO Auto-generated constructor stub
		this.strMethod = strMethod;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return strMethod.displaceChar();
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return strMethod.displaceChar();
	}
	
}

public class Exercise911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waveform w = new Waveform();
		FilterProcessor.process(new StrMethodAdapter(new StrMethod("sdasd")), w);
		FilterProcessor.process(new StrMethodAdapter(new StrMethod("sadtht")), w);
		FilterProcessor.process(new StrMethodAdapter(new StrMethod("hythty")), w);
	}

}
