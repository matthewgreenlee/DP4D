package com.goldenpond.facade;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WrappedClassA {

	private static final Log log = LogFactory.getLog(WrappedClassA.class);

	public void action() {
		log.info("WrappedClass01 in action");
	}
}
