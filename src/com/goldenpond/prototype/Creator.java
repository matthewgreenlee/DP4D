package com.goldenpond.prototype;

import com.goldenpond.utils.Print;

public class Creator {

	private Product prototypeProduct = new Product();

	public Product getProduct() {
		return (Product) prototypeProduct.clone();
	}
	
	public static void main(String[] args) {
		Creator creator = new Creator();
		Product product = creator.getProduct();
		Print.ln(product);
		Product product2 = creator.getProduct();
		Print.ln(product2);
	}
}

class Product implements Cloneable {

	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}