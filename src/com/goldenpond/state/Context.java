package com.goldenpond.state;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Context {

	private static final Log log = LogFactory.getLog(Context.class);

	private State stateA;
	
	private State stateB;
	
	private State stateC;
	
	private State state;

	public Context() {
		super();
		// TODO Auto-generated constructor stub
		stateA = new StateA(this);
		stateB = new StateB(this);
		stateC = new StateC(this);
		// initialize the state
		state = stateA;
	}

	public State getStateA() {
		return stateA;
	}

	public State getStateB() {
		return stateB;
	}

	public State getStateC() {
		return stateC;
	}

	public void setState(State state) {
		this.state = state;
		log.info("Context enter the state of " + state.getClass().getSimpleName());
	}
	
	public void action01() {
		state.action01();
	}
	
	public void action02() {
		state.action02();
	}
	
	public void action03() {
		state.action03();
	}
	
	public void action04() {
		state.action04();
	}
	
	public static void main(String[] args) {
		Context context = new Context();
		context.action01();
		context.action02();
		context.action03();
	}
}
