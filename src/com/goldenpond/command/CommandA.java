package com.goldenpond.command;

public class CommandA implements Command {

	private ReceiverA receiverA;

	public CommandA(ReceiverA receiverA) {
		super();
		this.receiverA = receiverA;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiverA.action01();
	}

}
