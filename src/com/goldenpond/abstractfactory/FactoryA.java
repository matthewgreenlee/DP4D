package com.goldenpond.abstractfactory;

public class FactoryA extends AbstractFactory {

	@Override
	public AbstractPartA createPartA() {
		// TODO Auto-generated method stub
		return new PartA1();
	}

	@Override
	public AbstractPartB createPartB() {
		// TODO Auto-generated method stub
		return new PartB2();
	}

	@Override
	public AbstractPartC createPartC() {
		// TODO Auto-generated method stub
		return new PartC1();
	}

}
