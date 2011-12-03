package com.goldenpond.factorymethod;

import com.goldenpond.utils.Print;

public class Main {

	public static void main(String[] args) {
		Creator creator = new CreatorA();
		Product product = creator.createProduct();
		Print.ln(product);
		
		creator = new CreatorB();
		product = creator.createProduct();
		Print.ln(product);
	}
}
