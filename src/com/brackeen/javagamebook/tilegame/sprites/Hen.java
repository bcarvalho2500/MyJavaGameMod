package com.brackeen.javagamebook.tilegame.sprites;

import com.brackeen.javagamebook.graphics.Animation;

public class Hen extends Fly{

	public Hen(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
		super(left, right, deadLeft, deadRight);
		// TODO Auto-generated constructor stub
		
		flying = true;
		setHealth(2);
		
	}
	
	
}
