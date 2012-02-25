package com.goldenpond.command.example;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Waiter {

	private Set<Order> orders = new HashSet<Order>();

	public void takeOrder(Order order) {
		com.goldenpond.utils.Print.ln("i take order: " + order);
		this.orders.add(order);
	}

	public Collection<Dish> sendToKitchen(Order order) {
		if (!orders.contains(order)) {
			orders.add(order);
		}
		return order.orderUp();
	}

	public Order createOrder() {
		Order order = new GeneralOrder();
		orders.add(order);
		return order;
	}
}
