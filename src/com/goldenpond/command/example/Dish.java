package com.goldenpond.command.example;

public class Dish {

	private String name;
	private Cook cook;

	public Dish(Cook cook, String name) {
		super();
		this.name = name;
		this.cook = cook;
	}

	public void waitForReady() {
		cook.cook(this);
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + "]";
	}
}
