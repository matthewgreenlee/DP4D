package com.goldenpond.factorymethod;

public class CreatorB extends Creator {

	@Override
	public Product createProduct() {
		return new ProductB();
	}

}
