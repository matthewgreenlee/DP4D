package com.goldenpond.command2.application;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private String name;
	private List<MenuItem> items = new ArrayList<MenuItem>();

	Menu(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<MenuItem> getItems() {
		return items;
	}

	public void add(MenuItem item) {
		items.add(item);
	}
}
