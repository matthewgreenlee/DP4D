package com.goldenpond.facade;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WrappedClassB {

	private static final Log log = LogFactory.getLog(WrappedClassB.class);

	public void action() {
		log.info("WrappedClass02 in action");
	}
}
