package com.goldenpond.mediator;

public class Mediator {

	private Colleague a = new ColleagueA(this);

	private Colleague b = new ColleagueB(this);

	public void hello(Colleague colleague) {
		if (this.a == colleague) {
			b.replyHello();
		}
		if (this.b == colleague) {
			a.replyHello();
		}
	}

	// doesn't mean anything, just an entry point for main method
	public void introduce() {
		a.sayHello();
		b.sayHello();
	}

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		mediator.introduce();
	}
}
