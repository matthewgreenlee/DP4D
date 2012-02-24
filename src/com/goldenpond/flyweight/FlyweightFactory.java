package com.goldenpond.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	private static HashMap<String, Flyweight> map = new HashMap<String, Flyweight>();

	static {
		map.put("Red", new Flyweight("Red"));
		map.put("Yellow", new Flyweight("Yellow"));
		map.put("Blue", new Flyweight("Blue"));
	}

	public static Flyweight getFlyweight(String name) {
		return map.get(name);
	}
}
