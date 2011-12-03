package com.goldenpond.state.example;

public class ATM {

	private State minMoneyState;
	private State maxMoneyState;
	private State availableMoneyState;
	
	private State state;
	
	private int money;

	public static final int MAX_MONEY = 50000;
	public static final int MIN_MONEY = -10;
	
	public ATM(int money) {
		super();
		minMoneyState = new StateMinMoney(this);
		maxMoneyState = new StateMaxMoney(this);
		availableMoneyState = new StateAvailableMoney(this);
		this.money = money;
		if (money <= MIN_MONEY) {
			state = minMoneyState;
		} else if (money >= MAX_MONEY) {
			state = maxMoneyState;
		} else {
			state = availableMoneyState;
		}
	}

	public State getMinMoneyState() {
		return minMoneyState;
	}

	public State getMaxMoneyState() {
		return maxMoneyState;
	}

	public State getAvailableMoneyState() {
		return availableMoneyState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void query() {
		state.query();
	}
	
	public void withdraw(int amount) {
		state.withdraw(amount);
	}
	
	public void deposit(int amount) {
		state.deposit(amount);
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM(100);
		atm.query();
		atm.deposit(1000);
		atm.query();
		atm.withdraw(600);
		atm.query();
		atm.deposit(49500);
		atm.query();
		atm.withdraw(50000);
		atm.query();
		atm.withdraw(10);
		atm.query();
	}
}
