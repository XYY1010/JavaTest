package com.xyy.test12;

import static com.xyy.tools.Print.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.xyy.test9.ForEachCollections;

class HShape {
	boolean highlighted = false;
	
	public void highlight() {
		highlighted = true;
	}
	
	public void clearHighlight() {
		highlighted = false;
	}
	
	void draw() {
		print(this + ".draw()");
	}
	
	public String toString() {
		return getClass().getName() + (highlighted ? " highlighted" : " normal");
	}
	
	static List<HShape> shapes = new ArrayList<HShape>();
	
	public HShape() {
		shapes.add(this);
	}
	
	static void highlight1(Class<?> type) {
		for (HShape hShape : shapes) {
			if (type.isInstance(hShape)) {
				hShape.highlight();
			}
		}
	}
	
	static void clearHighlight1(Class<?> type) {
		for (HShape hShape : shapes) {
			if (type.isInstance(hShape)) {
				hShape.clearHighlight();
			}
		}
	}
	
	static void forEach(Class<?> type, String method) {
		try {
			Method m = HShape.class.getMethod(method, (Class<?>[]) null);
			for (HShape hShape : shapes) {
				if (type.isInstance(hShape)) {
					m.invoke(hShape, (Object[]) null);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	static void highlight2(Class<?> type) {
		forEach(type, "highlight");
	}
	
	static void clearHighlight2(Class<?> type) {
		forEach(type, "clearHighlight");
	}
}

class HCircle extends HShape {}
class HSquare extends HShape {}
class HTriangle extends HShape {}

public class Exercise1406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HShape> shapes = Arrays.asList(new HCircle(), new HSquare(), new HTriangle(), new HSquare(), new HTriangle());
		HSquare.highlight1(HCircle.class);
		HSquare.highlight2(HCircle.class);
		for (HShape hShape : shapes) {
			hShape.draw();
		}
		print("*********************************************");
		HSquare.highlight1(HShape.class);
		HSquare.highlight2(HShape.class);
		for (HShape hShape : shapes) {
			hShape.draw();
		}
		print("*********************************************");
		HShape.clearHighlight1(ArrayList.class);
		HShape.clearHighlight2(ArrayList.class);
		for (HShape hShape : shapes) {
			hShape.draw();
		}
	}
	
	// 在main方法中，通过给对象设置标示（例子中是HCircle，HShape，ArrayList），指定特定形状
	// 的标示，经过检查是否为shape的实例对象后对各种形状的对象设标示。最后由toString()打印出来。

}
