package com.goldenpond.abstractfactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractPartB {

	protected static final Log log = LogFactory.getLog(AbstractPartB.class);

	public AbstractPartB() {
		super();
		// TODO Auto-generated constructor stub
		log.info(this.getClass().getSimpleName() + " was created");
	}
	
}
