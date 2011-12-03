package com.goldenpond.state.example;

public class StateMinMoney extends State {

	public StateMinMoney(ATM atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if (amount + atm.getMoney() > ATM.MAX_MONEY) {
			super.deposit(amount);
		} else {
			atm.setMoney(atm.getMoney() + amount);
			if (atm.getMoney() >= ATM.MAX_MONEY) {
				atm.setState(atm.getMaxMoneyState());
			} else {
				atm.setState(atm.getAvailableMoneyState());
			}
		}
	}

}
