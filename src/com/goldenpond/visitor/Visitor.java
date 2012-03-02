package com.goldenpond.visitor;

public interface Visitor {

	public abstract void visit(ElementA element);

	public abstract void visit(ElementB element);
}
