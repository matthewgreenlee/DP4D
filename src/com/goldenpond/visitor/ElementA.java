package com.goldenpond.visitor;

public class ElementA extends Element {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
