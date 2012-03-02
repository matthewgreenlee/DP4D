package com.goldenpond.visitor;

import com.goldenpond.utils.Print;

public class VisitorA extends Visitor {

	@Override
	public void visit(ElementA element) {
		Print.ln("VisitorA visits ElementA " + element.toString());
	}

	@Override
	public void visit(ElementB element) {
		Print.ln("VisitorA visits ElementB " + element.toString());
	}

}
