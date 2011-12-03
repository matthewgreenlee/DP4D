package com.goldenpond.facade;


// i know nothing but Facade class
public class Client {

	public void callFacade() {
		Facade facade = new Facade();
		facade.service();
	}
}
