package com.goldenpond.strategy.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BowAndArrowBehavior implements WeaponBehavior {

	private static Log log = LogFactory.getLog(BowAndArrowBehavior.class);

	@Override
	public void useWeapon() {
		// TODO Auto-generated method stub
		log.info("Using Bow and Arrow weapon");
	}

}
