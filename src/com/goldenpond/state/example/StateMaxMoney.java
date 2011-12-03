package com.goldenpond.state.example;

public class StateMaxMoney extends State {

	public StateMaxMoney(ATM atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (amount > ATM.MAX_MONEY - ATM.MIN_MONEY) {
			super.withdraw(amount);
		} else {
			atm.setMoney(atm.getMoney() - amount);
			if (atm.getMoney() <= ATM.MIN_MONEY) {
				atm.setState(atm.getMinMoneyState());
			} else {
				atm.setState(atm.getAvailableMoneyState());
			}
		}
	}
}
