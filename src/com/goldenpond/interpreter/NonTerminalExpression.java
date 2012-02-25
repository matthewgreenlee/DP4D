package com.goldenpond.interpreter;

import com.goldenpond.utils.Print;

public class NonTerminalExpression extends AbstractExpression {

	private AbstractExpression[] expressions;

	NonTerminalExpression(AbstractExpression[] expressions) {
		super();
		this.expressions = expressions;
	}

	@Override
	public void interpret(Context context) {
		// iteration over each subexpression
		for (AbstractExpression expression : expressions) {
			expression.interpret(context);
		}
		// add optional feature based on subexpressions interpreting result
		Print.ln("interpretted the context after subexpressions interpreting");
	}

}
