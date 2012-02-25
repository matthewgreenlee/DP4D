package com.goldenpond.interpreter.example;

import java.util.ArrayList;

public class MainInterpreter {

	public static void main(String[] args) {
		
	      String roman = "MCMXXVIII";
	      Context context = new Context(roman);

	      // Build the 'parse tree' 
	      ArrayList<Expression> tree = new ArrayList<Expression>();
	      tree.add(new ThousandExpression());
	      tree.add(new HundredExpression());
	      tree.add(new TenExpression());
	      tree.add(new OneExpression());

	      // Interpret 
	      for (Expression exp : tree) {
	    	  exp.interpret(context);
	      }

	      System.out.println(roman + " = " + Integer.toString(context.getOutput()));
	}
}
