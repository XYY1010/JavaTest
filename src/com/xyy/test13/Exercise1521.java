package com.xyy.test13;

import java.util.HashMap;
import java.util.Map;

import static com.xyy.tools.Print.*;

public class Exercise1521<T> {

	Class<T> kind;
	Map<String, Class<?>> mp;
	public Exercise1521(Class<T> kind, Map<String, Class<?>> mp) {
		this.kind = kind;
		this.mp = mp;
		addType(kind.getSimpleName(), kind);
	}	
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	public void addType(String typename, Class<?> kind) {
		if (mp.containsKey(typename)) {
			return;
		}
		mp.put(typename, kind);
	}
	public Class createNew(String typename) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (Class) Class.forName(typename).newInstance();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Map<String, Class<?>> map = new HashMap<String, Class<?>>();
		Exercise1521<Building> cttb = new Exercise1521<Building>(Building.class, map);
		print(map);
		cttb.createNew("com.xyy.test13.ClassTypeCapture");
		print(map);
	}

}
