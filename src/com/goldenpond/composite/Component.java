package com.goldenpond.composite;

public abstract class Component {

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void add(Component component) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(Component component) {
		throw new UnsupportedOperationException();
	}
}
