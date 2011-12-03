package com.goldenpond.strategy;

public class Context {

	private IStrategy strategy;

	Context(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void doSomething() {
		strategy.execute();
	}

	public static void main(String[] args) {
		IStrategy strategy = new ConcreateStrategyA();
		Context context = new Context(strategy);
		context.doSomething();
	}
}
