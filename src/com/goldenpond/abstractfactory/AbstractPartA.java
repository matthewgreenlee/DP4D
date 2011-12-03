package com.goldenpond.abstractfactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractPartA {

	protected static final Log log = LogFactory.getLog(AbstractPartA.class);

	public AbstractPartA() {
		super();
		// TODO Auto-generated constructor stub
		log.info(this.getClass().getSimpleName() + " was created");
	}

}
