package com.xyy.test8;

import static com.xyy.tools.Print.*;

import java.util.Random;

interface MakeDecision {
	void toss();
	int status();
}

interface DecisionFactory {
	MakeDecision getDecision();
}

class TossCoins implements MakeDecision {

	private TossCoins() {}
	
	private static String[] coinStatus = {"正", "反"};
	Random rand = new Random(47);
	
	@Override
	public void toss() {
		// TODO Auto-generated method stub
		print("投掷硬币结果：" + coinStatus[rand.nextInt(2)]);
	}

	@Override
	public int status() {
		// TODO Auto-generated method stub
		return coinStatus.length;
	}
	
	public static DecisionFactory factory = new DecisionFactory() {
		
		@Override
		public MakeDecision getDecision() {
			// TODO Auto-generated method stub
			return new TossCoins();
		}
	};
	
}

class Dice implements MakeDecision {
	
	private Dice() {}
	private static String[] DiceStatus = {"1", "2", "3", "4", "5", "6"};
	Random rand = new Random(47);
	@Override
	public void toss() {
		// TODO Auto-generated method stub
		print("掷骰子结果：" + DiceStatus[rand.nextInt(6)]);
	}

	@Override
	public int status() {
		// TODO Auto-generated method stub
		return DiceStatus.length;
	}
	
	public static DecisionFactory factory = new DecisionFactory() {
		
		@Override
		public MakeDecision getDecision() {
			// TODO Auto-generated method stub
			return new Dice();
		}
	};
	
}

public class Exercise1017 {

	public static void Toss(DecisionFactory factory) {
		MakeDecision md = factory.getDecision();
		print("共有"+ md.status() +"种情况");
		md.toss();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toss(TossCoins.factory);
		Toss(Dice.factory);
	}

}
