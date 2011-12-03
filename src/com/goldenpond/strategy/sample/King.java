package com.goldenpond.strategy.sample;

public class King extends Character {

	public King() {
		super();
		// King use Sword as weapon by default
		this.weapon = getSword();
	}

	@Override
	public void fight() {
		super.fight();
		// King's customized behavior can be specified here
	}

}
