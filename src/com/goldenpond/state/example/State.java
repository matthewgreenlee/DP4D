package com.goldenpond.state.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class State {

	protected static final Log log = LogFactory.getLog(State.class);
	
	protected ATM atm;
	
	public State(ATM atm) {
		super();
		this.atm = atm;
	}

	public final void query() {
		log.info("Cunrrent available money is: " + atm.getMoney());
	}
	
	public void withdraw(int amount) {
		throw new UnsupportedOperationException("Your request is out of available money");
	}
	
	public void deposit(int amount) {
		throw new UnsupportedOperationException("Your request is out of available money");
	}
}
