package com.goldenpond.command;

public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void methodCall() {
		command.execute();
	}

	public void rollBack() {
		command.undo();
	}
}
