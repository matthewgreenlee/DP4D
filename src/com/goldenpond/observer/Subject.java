package com.goldenpond.observer;

public interface Subject {

	public abstract void registerObserver(Observer observer);

	public abstract void removeObserver(Observer observer);

	public abstract void notifyObservers();
	
	public abstract void setData(Object data);
	
	// observer will pull data via this method
	public abstract Object getData();
}
