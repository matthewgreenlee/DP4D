package com.goldenpond.state;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class State {

	protected static final Log log = LogFactory.getLog(State.class);
	
	// hold a reference of Context which is tight coherent
	protected Context context;
	
	public State(Context context) {
		super();
		this.context = context;
	}

	public abstract void action01();
	
	public abstract void action02();
	
	public abstract void action03();
	
	public abstract void action04();
}
