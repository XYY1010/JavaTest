package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Game{
	Game(int i){
		print("Game Constructor" + i);
	}
}

class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		print("BoardGame Constructor" + i);
	}
}

public class Chess extends BoardGame{

	Chess(){
		super(11);
		print("Chess Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess chess = new Chess();
	}

}
