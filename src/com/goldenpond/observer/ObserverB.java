package com.goldenpond.observer;

import com.goldenpond.utils.Print;

public class ObserverB extends Observer {

	public ObserverB(Subject subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Object data) {
		// TODO Auto-generated method stub
		Print.ln(this.getClass().getSimpleName() + " got latest subject data: " + data);
	}

}
