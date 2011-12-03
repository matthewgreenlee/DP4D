package com.goldenpond.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ConcreteSubject implements Subject {

	private Object data;

	private Collection<Observer> observers = new ArrayList<Observer>();
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> iter = observers.iterator();
		while (iter.hasNext()) {
			Observer observer = (Observer) iter.next();
			observer.update(data);
		}
	}
}
