package com.goldenpond.strategy.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class KnifeBehavior implements WeaponBehavior {

	private static Log log = LogFactory.getLog(KnifeBehavior.class);

	@Override
	public void useWeapon() {
		// TODO Auto-generated method stub
		log.info("Using Knife weapon");
	}

}
