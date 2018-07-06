package com.xyy.test13;
// {CompileTimeError} (Won't compile)

import java.util.List;

public class UseList<W, T> {
	void f(List<T> v) {}
	// void f(List<W> v) {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
