package com.goldenpond.mediator;

import com.goldenpond.utils.Print;

public class ColleagueA implements Colleague {

	private Mediator mediator;

	ColleagueA(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	@Override
	public void sayHello() {
		Print.ln(this.getClass().getName() + " is saying hello");
		mediator.hello(this);
	}

	@Override
	public void replyHello() {
		Print.ln(this.getClass().getName() + " is replying hello");
	}

}
