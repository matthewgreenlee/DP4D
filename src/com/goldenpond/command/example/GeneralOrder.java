package com.goldenpond.command.example;

import java.util.Collection;

public class GeneralOrder extends Order {

	@Override
	public Collection<Dish> orderUp() {
		for (Dish dish: dishes) {
			dish.waitForReady();
		}
		return dishes;
	}

	@Override
	public String toString() {
		return "GeneralOrder [dishes=" + dishes + "]";
	}

}
