package com.goldenpond.interpreter;

public class Client {

	public static void main(String[] args) {
		AbstractExpression expression = buildSyntaxTree();
		expression.interpret(new Context());
	}

	private static AbstractExpression buildSyntaxTree() {
		AbstractExpression[] arrExpr = new AbstractExpression[3];
		// build syntax tree according to domain model
		arrExpr[0] = new TerminalExpression();
		arrExpr[1] = new TerminalExpression();
		arrExpr[2] = new TerminalExpression();
		AbstractExpression expression = new NonTerminalExpression(arrExpr);
		
		return expression;
	} 
}
