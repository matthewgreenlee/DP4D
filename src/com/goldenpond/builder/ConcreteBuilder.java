package com.goldenpond.builder;


public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		//doBuildPartA
		product.setA(new PartA());
		com.goldenpond.utils.Print.ln("part a is being built");
	}

	@Override
	public void buildPartB() {
		//doBuildPartB
		product.setB(new PartB());
		com.goldenpond.utils.Print.ln("part b is being built");
	}

}
