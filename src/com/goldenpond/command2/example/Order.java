package com.goldenpond.command2.example;

import java.util.Collection;
import java.util.LinkedList;

public abstract class Order {

	protected Collection<Dish> dishes = new LinkedList<Dish>();

	public abstract Collection<Dish> orderUp();

	public void addDish(Dish dish) {
		dishes.add(dish);
	}
}
