package com.goldenpond.flyweight;

public class Flyweight {

	private String name;

	public Flyweight(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Flyweight [name=" + name + "]";
	}

}
