package com.goldenpond.strategy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StrategyA implements Strategy {

	private static final Log log = LogFactory.getLog(StrategyA.class);

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		log.info("am performing strategy A");
	}

}
