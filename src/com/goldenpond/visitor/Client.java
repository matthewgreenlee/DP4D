package com.goldenpond.visitor;

public class Client {

	public static void main(String[] args) {

		Element[] elements = {new ElementA(), new ElementB()};
		Visitor va = new VisitorA();
		Visitor vb = new VisitorB();
		for (Element element : elements) {
			element.accept(va);
			element.accept(vb);
		}
	}

}
