package com.goldenpond.strategy.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class AxeBehavior implements WeaponBehavior {

	private static Log log = LogFactory.getLog(AxeBehavior.class);

	@Override
	public void useWeapon() {
		// TODO Auto-generated method stub
		log.info("Using Axe weapon");
	}

}
