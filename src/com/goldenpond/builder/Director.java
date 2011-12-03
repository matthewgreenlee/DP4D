package com.goldenpond.builder;

import com.goldenpond.utils.Print;

public class Director {

	public Product construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
		// build more parts if necessary
		return builder.getResult();
	}

	public static void main(String[] args) {
		Director director = new Director();
		Builder builder = new ConcreteBuilder();
		Product product = director.construct(builder);
		Print.ln(product);
	}
}
