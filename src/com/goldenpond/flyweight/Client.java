package com.goldenpond.flyweight;

import com.goldenpond.utils.Print;

public class Client {

	public static void main(String[] args) {
		Button redBtn = new Button(FlyweightFactory.getFlyweight("Red"));
		Button blueBtn = new Button(FlyweightFactory.getFlyweight("Blue"));
		redBtn.draw();
		blueBtn.draw();
		Button anotherBtn = new Button(FlyweightFactory.getFlyweight("Red"));
		anotherBtn.draw();
	}
}

class Button {
	private Flyweight color;

	Button(Flyweight color) {
		super();
		this.color = color;
	}

	public void draw() {
		Print.ln("draw a " + this.color + " button");
	}
}