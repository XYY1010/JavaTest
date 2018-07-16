package com.xyy.test13;

class Coffee {
	private String value;
	public void set(String val) { this.value = val; }
	public String get() { return value; }
}

class Relish extends Coffee {
	protected Coffee coffee;
	public Relish(Coffee coffee) {
		this.coffee = coffee;
	}
	public void set(String val) { coffee.set(val); }
	public String get() { return coffee.get(); }
}

class Milk extends Relish {
	private String name = this.getClass().getSimpleName();
	public Milk(Coffee coffee) { super(coffee); }
	public String getName() { return name; }
}

class Foam extends Relish {
	private String name = this.getClass().getSimpleName();
	public Foam(Coffee coffee) { super(coffee); }
	public String getName() { return name; }
}

class Chocolate extends Relish {
	private String name = this.getClass().getSimpleName();
	public Chocolate(Coffee coffee) { super(coffee); }
	public String getName() { return name; }
}

class Caramel extends Relish {
	private String name = this.getClass().getSimpleName();
	public Caramel(Coffee coffee) { super(coffee); }
	public String getName() { return name; }
}

class Cream extends Relish {
	private String name = this.getClass().getSimpleName();
	public Cream(Coffee coffee) { super(coffee); }
	public String getName() { return name; }
}

public class Exercise1538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Milk m = new Milk(new Coffee());
		Milk m1 = new Milk(new Chocolate(new Coffee()));
		System.out.println(m.getName() + " " + m1.getName());
	}

}
