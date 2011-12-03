package com.goldenpond.proxy;

public class Client {

	public static void main(String[] args) {
		ISubject subject = new Proxy();
		subject.bizMethod();
	}
}
