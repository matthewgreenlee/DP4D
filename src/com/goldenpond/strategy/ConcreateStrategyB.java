package com.goldenpond.strategy;


public class ConcreateStrategyB implements IStrategy {

	@Override
	public void execute() {
		com.goldenpond.utils.Print.ln("execution based on strategy B");
	}

}
