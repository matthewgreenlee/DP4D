package com.goldenpond.strategy;


public class ConcreateStrategyA implements IStrategy {

	@Override
	public void execute() {
		com.goldenpond.utils.Print.ln("execution based on strategy A");
	}

}
