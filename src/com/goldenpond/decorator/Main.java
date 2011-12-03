package com.goldenpond.decorator;

public class Main {

	public static void main(String[] args) {
		
		Component component01 = new ConcreteComponent();
		System.out.println(component01.cost());
		Component component02 = new ConcreteDecorator(component01);
		System.out.println(component02.cost());
		Component component03 = new ConcreteDecorator(component02);
		System.out.println(component03.cost());
	}
}
