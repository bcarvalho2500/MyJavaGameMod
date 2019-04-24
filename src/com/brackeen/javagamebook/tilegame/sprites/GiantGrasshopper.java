package com.brackeen.javagamebook.tilegame.sprites;

import com.brackeen.javagamebook.codereflection.CodeReflection;
import com.brackeen.javagamebook.graphics.Animation;

public class GiantGrasshopper extends Creature{
	
	public GiantGrasshopper(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
		
		super(left,right,deadLeft,deadRight);
		
		if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=1)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
		
		this.jumpSpeed = -0.65f;
		this.trackPlayer=true;
	}

}
