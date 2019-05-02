package com.brackeen.javagamebook.tilegame.sprites;

import com.brackeen.javagamebook.codereflection.CodeReflection;
import com.brackeen.javagamebook.graphics.Animation;

public class Egg extends Creature{

	public Egg(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
		super(left, right, deadLeft, deadRight);
		// TODO Auto-generated constructor stub
		
	}
	public float getMaxSpeed() 
    {//Return the max speed of this Sinuous Fly
    	
    	//Code Tracing
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=2)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
        return 0;
    }

}
