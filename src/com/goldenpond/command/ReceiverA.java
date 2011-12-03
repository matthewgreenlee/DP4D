package com.goldenpond.command;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ReceiverA {

	private static final Log log = LogFactory.getLog(ReceiverA.class);

	public void action01() {
		log.info(this.getClass().getSimpleName() + " in action01");
	}
	
	public void action02() {
		log.info(this.getClass().getSimpleName() + " in action02");
	}
}
