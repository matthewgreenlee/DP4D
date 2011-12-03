package com.goldenpond.builder;

public class Product {

	private PartA a;

	private PartB b;

	public void setA(PartA a) {
		this.a = a;
	}

	public void setB(PartB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Product [a=" + a + ", b=" + b + "]";
	}
}
