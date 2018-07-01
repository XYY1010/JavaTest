package com.xyy.test12;

import java.util.Arrays;
import java.util.List;

import static com.xyy.tools.Print.*;

public class SnowRemovalRobot implements Robot {
	
	private String name;
	
	public SnowRemovalRobot(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "SnowBot series 11";
	}

	@Override
	public List<Operation> operations() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Operation() {

			@Override
			public String description() {
				// TODO Auto-generated method stub
				return name + " can shovel snow";
			}

			@Override
			public void command() {
				// TODO Auto-generated method stub
				print(name + " shoveling snow");
			}
			
		}, new Operation() {
			
			@Override
			public String description() {
				// TODO Auto-generated method stub
				return name + " can chip ice";
			}
			
			@Override
			public void command() {
				// TODO Auto-generated method stub
				print(name + " chipping ice");
			}
		}, new Operation() {
			
			@Override
			public String description() {
				// TODO Auto-generated method stub
				return name + " can clear the roof";
			}
			
			@Override
			public void command() {
				// TODO Auto-generated method stub
				print(name + " cleaning roof");
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot.Test.test(new SnowRemovalRobot("Slusher"));
	}

}
