package com.goldenpond.interpreter;

import com.goldenpond.utils.Print;

public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		Print.ln("interpretted the context");
	}

}
