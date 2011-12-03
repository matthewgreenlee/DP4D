package com.goldenpond.command;

public class MacroCommand implements Command{

	private Command[] commands;

	public MacroCommand(Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

}
