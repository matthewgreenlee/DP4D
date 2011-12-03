package com.goldenpond.abstractfactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractPartC {

	protected static final Log log = LogFactory.getLog(AbstractPartC.class);

	public AbstractPartC() {
		super();
		// TODO Auto-generated constructor stub
		log.info(this.getClass().getSimpleName() + " was created");
	}
}
