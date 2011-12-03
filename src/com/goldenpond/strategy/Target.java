package com.goldenpond.strategy;

public abstract class Target {

	private Strategy strategyA = new StrategyA();
	private Strategy strategyB = new StrategyB();
	
	protected Strategy strategy;

	public Strategy getStrategyA() {
		return strategyA;
	}

	public Strategy getStrategyB() {
		return strategyB;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void handleRequest() {
		strategy.perform();
	}
	
	public static void main(String[] args) {
		Target a = new TargetA();
		Target b = new TargetB();
		a.handleRequest();
		b.handleRequest();
		// exchange strategy
		a.setStrategy(a.getStrategyB());
		b.setStrategy(b.getStrategyA());
		a.handleRequest();
		b.handleRequest();
	}
}
