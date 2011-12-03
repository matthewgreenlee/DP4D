package com.goldenpond.observer;

import com.goldenpond.utils.Print;

public class ObserverA extends Observer {

	public ObserverA(Subject subject) {
		super(subject);
	}

	@Override
	public void update(Object data) {
		Print.ln(this.getClass().getSimpleName() + " got latest subject data: " + data);
	}

}
