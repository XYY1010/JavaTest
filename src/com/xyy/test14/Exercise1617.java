package com.xyy.test14;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;

class BigDecimalGenerator implements Generator<BigDecimal> {
	private Random rand = new Random();
	private BigDecimal b = new BigDecimal("121231231123123123");
	@Override
	public BigDecimal next() {
		// TODO Auto-generated method stub
		return b.add(new BigDecimal(rand.nextInt(47)));
	}
	
}

public class Exercise1617 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal[] b = Generated.array(BigDecimal.class, new BigDecimalGenerator(), 10);
		print("b = " + Arrays.toString(b));
	}

}
