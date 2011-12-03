package com.goldenpond.command;

public class CommandC implements Command {

	private ReceiverA receiverA;
	private ReceiverB receiverB;

	public CommandC(ReceiverA receiverA, ReceiverB receiverB) {
		super();
		this.receiverA = receiverA;
		this.receiverB = receiverB;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiverA.action01();
		receiverB.action02();
	}

}
