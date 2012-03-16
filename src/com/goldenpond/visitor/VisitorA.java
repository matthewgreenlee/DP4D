package com.goldenpond.visitor;

import com.goldenpond.utils.Print;

public class VisitorA extends ReflectiveVisitor {

	public void visitElementB(ElementB element) {
		Print.ln("VisitorA visits ElementB " + element.toString());
	}

}
