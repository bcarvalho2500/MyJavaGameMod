
package com.brackeen.javagamebook.tilegame.sprites;

	import com.brackeen.javagamebook.graphics.Animation;

	import com.brackeen.javagamebook.util.*;
	import com.brackeen.javagamebook.codereflection.*;

	public class Hollow extends Creature {
		
		private static final int MILI_PER_SECOND = 1000; 
		//TODO set a jump interval to only jump after a certain number of seconds
		// have elapsed.
		private long initJumpInterval = 2 * MILI_PER_SECOND; 
		private long jumpInterval = initJumpInterval;
//	    private Throwable e = new Throwable();
		
		/**
		 * @param left
		 * @param right
		 * @param deadLeft
		 * @param deadRight
		 */
		public Hollow(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
			super(left, right, deadLeft, deadRight);
	    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
	        	if(CodeReflection.getAbstactionLevel()>=1)
	        	{//check to make sure it's this level of abstraction
	        		e.fillInStackTrace();		
	        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
	        								e.getStackTrace()[0].getMethodName());
	        	}
	        	health = 3;
	    	}
			//TODO set the creatures jump speed using protected jumpSpeed class variable
			this.jumpSpeed = -0.75f;
			this.trackPlayer=true;
			
		}
		
		
	    public float getMaxSpeed() {
	    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
	        	if(CodeReflection.getAbstactionLevel()>=2)
	        	{//check to make sure it's this level of abstraction
	        		e.fillInStackTrace();		
	        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
	        								e.getStackTrace()[0].getMethodName());
	        	}
	    	}
	        return 0.05f * enemySpeedMultiplier;
	    }
	    

	    
		public void update(long elapsedTime) {
			// Call super to maintain animation behavior
			super.update(elapsedTime);
	    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
	        	if(CodeReflection.getAbstactionLevel()>=4)
	        	{//check to make sure it's this level of abstraction
	        		e.fillInStackTrace();		
	        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
	        								e.getStackTrace()[0].getMethodName());
	        	}
	    	}
			if((totalElapsedTime % jumpInterval)-elapsedTime<0){
				jump();
				jumpInterval = initJumpInterval + RandomUtil.getRandomInt(300);
			}
		}
	}

