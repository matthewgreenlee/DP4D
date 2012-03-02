package com.goldenpond.visitor;

public class ElementB extends Element {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
