package com.goldenpond.observer.example;

public class Main {

	// this is to test standard JDK observer pattern implementation
	public static void main(String[] args) {
		Newspaper newspaper = new Newspaper();
		new Subscriber(newspaper);
		newspaper.setContent("LATEST NEWS");
		newspaper.setContent("CHANGED NEWS");
		newspaper.setContent("CHANGED NEWS");
	}
}
