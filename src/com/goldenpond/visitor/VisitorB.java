package com.goldenpond.visitor;

import com.goldenpond.utils.Print;

public class VisitorB extends ReflectiveVisitor {

	public void visitElementA(ElementA element) {
		Print.ln("VisitorB visits ElementA " + element.toString());
	}

}
