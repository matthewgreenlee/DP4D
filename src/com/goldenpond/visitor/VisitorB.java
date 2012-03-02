package com.goldenpond.visitor;

import com.goldenpond.utils.Print;

public class VisitorB implements Visitor {

	@Override
	public void visit(ElementA element) {
		Print.ln("VisitorB visits ElementA " + element.toString());
	}

	@Override
	public void visit(ElementB element) {
		Print.ln("VisitorB visits ElementB " + element.toString());
	}

}
