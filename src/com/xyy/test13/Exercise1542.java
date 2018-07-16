package com.xyy.test13;

import static com.xyy.tools.Print.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

import static com.xyy.test13.Funcational.*;

class AT implements UnaryPredicate<Pet> {
    public boolean test(Pet p){return p.getClass().getSimpleName().equals("Pet");};
}	
class BT implements UnaryPredicate<Dog>{
    public boolean test(Dog p){return p.getClass().getSimpleName().equals("Dog");};
}

public class Exercise1542 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Integer result = reduce(li, new IntegerAdder());
		print(result);
		
		result = reduce(li, new IntegerSubtracter());
		print(result);
		
		print(filter(li, new GreaterThan<Integer>(4)));
		
		print(forEach(li, new MultiplyingIntegerCollector()).result());
		
		print(forEach(filter(li, new GreaterThan<Integer>(4)), new MultiplyingIntegerCollector()).result());
		
		MathContext mc = new MathContext(7);
		List<BigDecimal> lbd = Arrays.asList(new BigDecimal(1.1, mc), new BigDecimal(2.2, mc),
				new BigDecimal(3.3, mc), new BigDecimal(4.4, mc));
		BigDecimal rbd = reduce(lbd, new BigDecimalAdder());
		print(rbd);
		
	    print(filter(lbd,
	    	      new GreaterThan<BigDecimal>(new BigDecimal(3))));
	    	 
	    	    // Use the prime-generation facility of BigInteger:
	    	    List<BigInteger> lbi = new ArrayList<BigInteger>();
	    	    BigInteger bi = BigInteger.valueOf(11);
	    	    for(int i = 0; i < 11; i++) {
	    	      lbi.add(bi);
	    	      bi = bi.nextProbablePrime();
	    	    }
	    	    print(lbi);
	    	    BigInteger rbi = reduce(lbi, new BigIntegerAdder());
	    	    print(rbi);
	    	    // The sum of this list of primes is also prime:
	    	    print(rbi.isProbablePrime(5));
	    	    List<AtomicLong> lal = Arrays.asList(
	    	      new AtomicLong(11), new AtomicLong(47),
	    	      new AtomicLong(74), new AtomicLong(133));
	    	    AtomicLong ral = reduce(lal, new AtomicLongAdder());
	    	    print(ral);
	    	 
	    	    print(transform(lbd,new BigDecimalUlp()));
	    	 
	    	    List<Pet> lp=Arrays.asList(new Pet());
	    	    print(filter(lp,new AT()));
	    	    List<Dog> lg=Arrays.asList(new Dog());
	    	    print(filter(lg,new BT()));
		
	}

}
