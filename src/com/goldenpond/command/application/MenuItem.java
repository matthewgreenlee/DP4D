package com.goldenpond.command.application;

public class MenuItem {

	private String name;

	MenuItem(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void onClick(Command command) {
		command.execute();
	}
}
