package com.xyy.test13;

import static com.xyy.tools.Print.*;

interface ComicCompany {}

interface Marvel extends ComicCompany {
	void marvelSeries();
}
interface DC extends ComicCompany {
	void DCSeries();
}

class SuperHeroine<PRODUCE extends DC & Marvel>implements DC, Marvel {

	@Override
	public void marvelSeries() {
		// TODO Auto-generated method stub
		print("Black widow");
	}

	@Override
	public void DCSeries() {
		// TODO Auto-generated method stub
		print("Wonder woman");
	}
	
	public <T extends Marvel> void f(T t) {
		t.marvelSeries();
	}
	
	public <T extends DC> void g(T t) {
		t.DCSeries();
	}
	
}

public class Exercise1525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperHeroine s = new SuperHeroine();
		s.f(s);
		s.g(s);
	}

}
