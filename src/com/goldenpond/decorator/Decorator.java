package com.goldenpond.decorator;

public abstract class Decorator extends Component{

	protected Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return component.cost() + this.extendedCost();
	}
	
	public abstract int extendedCost();
}
