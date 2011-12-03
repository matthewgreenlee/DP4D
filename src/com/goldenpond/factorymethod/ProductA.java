package com.goldenpond.factorymethod;

import com.goldenpond.utils.Print;

public class ProductA implements Product {

	public ProductA() {
		super();
		Print.ln(this.getClass().getSimpleName() + " was instantiatd");
	}

}
