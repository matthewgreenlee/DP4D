package com.goldenpond.state.example;

public class StateAvailableMoney extends State {

	public StateAvailableMoney(ATM atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if (atm.getMoney() + amount > ATM.MAX_MONEY) {
			super.deposit(amount);
		} else {
			atm.setMoney(atm.getMoney() + amount);
			if (atm.getMoney() >= ATM.MAX_MONEY) {
				atm.setState(atm.getMaxMoneyState());
			}
		}
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (atm.getMoney() < amount + ATM.MIN_MONEY) {
			super.withdraw(amount);
		} else {
			atm.setMoney(atm.getMoney() - amount);
			if (atm.getMoney() <= ATM.MIN_MONEY) {
				atm.setState(atm.getMinMoneyState());
			}
		}
	}

}
