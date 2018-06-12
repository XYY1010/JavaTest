package com.xyy.test7;

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
	static String[] coinStatus = {"正", "反"};
	Random rand = new Random();
	public void toss() {
		print("投掷硬币结果：" + coinStatus[rand.nextInt(2)]);
	}
	public int status() { return coinStatus.length; }
}

class TossCoinsFactory implements DecisionFactory {
	public MakeDecision getDecision() {
		return new TossCoins();
	}
}

class Dice implements MakeDecision {
	static String[] DiceStatus = {"1", "2", "3", "4", "5", "6"};
	Random rand = new Random();
	public void toss() {
		print("掷骰子结果：" + DiceStatus[rand.nextInt(6)]);
	}
	public int status() { return DiceStatus.length; }
	
}

class DiceFactory implements DecisionFactory {
	public MakeDecision getDecision() {
		return new Dice();
	}
}

public class Exercise919 {
	
	public static void execute(DecisionFactory df) {
		MakeDecision md = df.getDecision();
		print("共有" + md.status() + "种情况");
		md.toss();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		execute(new TossCoinsFactory());
		execute(new DiceFactory());
	}

}
