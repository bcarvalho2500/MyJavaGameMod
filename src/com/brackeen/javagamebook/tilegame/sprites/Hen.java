package com.brackeen.javagamebook.tilegame.sprites;

import com.brackeen.javagamebook.codereflection.CodeReflection;
import com.brackeen.javagamebook.graphics.Animation;

public class Hen extends Fly{

	public Hen(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
		super(left, right, deadLeft, deadRight);
		// TODO Auto-generated constructor stub
		
		flying = true;
		setHealth(2);
		
	}
	
public boolean isFlying() {
    	
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=4)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
        return isAlive() && super.isFlying();
    }
	
}
