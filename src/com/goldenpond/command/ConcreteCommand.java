package com.goldenpond.command;

public class ConcreteCommand implements Command {

	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.actionA();
		receiver.actionB();
	}

	@Override
	public void undo() {
		receiver.undoActionB();
		receiver.undoActionA();
	}

}
