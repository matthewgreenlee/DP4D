package com.goldenpond.observer;

public abstract class Observer {

	protected Subject subject;

	public Observer(Subject subject) {
		super();
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	// subject will push data via this method
	public abstract void update(Object data);
}
