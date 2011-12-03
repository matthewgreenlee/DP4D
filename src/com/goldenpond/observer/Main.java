package com.goldenpond.observer;

public class Main {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		subject.setData("Initial value");
		
		new ObserverA(subject);
		new ObserverB(subject);

		subject.setData("Changed value");
		subject.setData("Changed back");
	}
}
