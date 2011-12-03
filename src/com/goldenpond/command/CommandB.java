package com.goldenpond.command;

public class CommandB implements Command {

	private ReceiverA receiverA;

	public CommandB(ReceiverA receiverA) {
		super();
		this.receiverA = receiverA;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiverA.action01();
		receiverA.action02();
	}

}
