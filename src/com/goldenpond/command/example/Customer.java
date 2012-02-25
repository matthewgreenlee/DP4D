package com.goldenpond.command.example;

import java.util.Collection;

public class Customer {

	private Waiter waiter;
	private Order order;

	public Customer(Waiter waiter) {
		super();
		this.waiter = waiter;
		this.order = waiter.createOrder();
	}

	public void chooseOrder(Order order) {
		this.order = order;
		waiter.takeOrder(this.order);
	}

	public void consumeAll(Collection<Dish> dishes) {
		com.goldenpond.utils.Print.ln("i'll eat out all the dishes" + dishes);
		dishes = null;
	}

	public void orderDish(Dish dish) {
		order.addDish(dish);
	}

	public void orderDone() {
		waiter.takeOrder(order);
	}

	public Order getOrder() {
		return order;
	}

	public static void main(String[] args) {
		// initialize a restaurant which includes a cook, an order, a waiter
		Cook cook = new Cook();
		Waiter waiter = new Waiter();
		
		// a customer came in
		Customer customer = new Customer(waiter);
		customer.orderDish(new Dish(cook, "fish"));
		customer.orderDish(new Dish(cook, "chicken"));
		customer.orderDone();
		Collection<Dish> dishes = waiter.sendToKitchen(customer.getOrder());
		customer.consumeAll(dishes);
	}
}
