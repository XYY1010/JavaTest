package generics.coffee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LiteralCoffeeCreator extends CoffeeCreator {

	// No try block needed.
	@SuppressWarnings("unchecked")
	public static final List<Class<? extends Coffee>> allTypes = 
		Collections.unmodifiableList(Arrays.asList(
				Coffee.class, Americano.class, Breve.class, 
				Cappuccino.class, Latte.class, Mocha.class));
	
	private static final List<Class<? extends Coffee>> types = 
			allTypes.subList(allTypes.indexOf(Americano.class), allTypes.size());
	
	public List<Class<? extends Coffee>> types() {
		return types;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(types);
	}

}
