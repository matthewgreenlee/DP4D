package com.goldenpond.command;

public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void request() {
		command.execute();
	}
	
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		
		ReceiverA receiverA = new ReceiverA();
		ReceiverB receiverB = new ReceiverB();

		Command command01 = new CommandA(receiverA);
		invoker.setCommand(command01);
		invoker.request();
		
		Command command02 = new CommandB(receiverA);
		invoker.setCommand(command02);
		invoker.request();
		
		Command command03 = new CommandC(receiverA, receiverB);
		invoker.setCommand(command03);
		invoker.request();
		
		Command command04 = new MacroCommand(new Command[]{command01, command02});
		invoker.setCommand(command04);
		invoker.request();
	}
}
