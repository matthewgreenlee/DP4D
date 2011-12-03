package com.goldenpond.strategy.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SwordBehavior implements WeaponBehavior {

	private static Log log = LogFactory.getLog(SwordBehavior.class);

	@Override
	public void useWeapon() {
		// just behavior here, no state changes
		log.info("Using Sword weapon");
	}

}
