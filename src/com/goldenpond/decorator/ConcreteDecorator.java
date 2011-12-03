package com.goldenpond.decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int extendedCost() {
		// TODO Auto-generated method stub
		return 3;
	}

}
