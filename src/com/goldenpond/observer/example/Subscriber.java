package com.goldenpond.observer.example;

import java.util.Observable;
import java.util.Observer;

import com.goldenpond.utils.Print;

public class Subscriber implements Observer {

	private Observable newspaper;

	public Subscriber(Observable newspaper) {
		super();
		this.newspaper = newspaper;
		this.newspaper.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		Print.ln("i got the latest information " + arg1 
				+ " from " + arg0.getClass().getSimpleName());
	}

}
