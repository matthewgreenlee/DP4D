package com.goldenpond.factorymethod;

import com.goldenpond.utils.Print;

public class ProductB implements Product {

	public ProductB() {
		super();
		Print.ln(this.getClass().getSimpleName() + " was instantiated");
	}

}
