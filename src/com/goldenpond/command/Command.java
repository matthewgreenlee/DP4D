package com.goldenpond.command;

public interface Command {
	
	/**
	 * overriding method should encapsulate the actions here
	 * which method-call receiver should take
	 */
	public void execute();
	
	/**
	 * overriding method should write undo logic here
	 * to roll back the action taken by execute()
	 */
	public void undo();
}
