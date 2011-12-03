package com.goldenpond.facade;

public class Facade {

	private WrappedClassA wrappedClassA = new WrappedClassA();
	private WrappedClassB wrappedClassB = new WrappedClassB();
	
	public void service() {
		wrappedClassA.action();
		wrappedClassB.action();
	}
}
