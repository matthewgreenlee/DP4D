package com.goldenpond.strategy.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class Character {

	protected static final Log log = LogFactory.getLog(Character.class);

	private BowAndArrowBehavior bowAndArrow = new BowAndArrowBehavior();
	private SwordBehavior sword = new SwordBehavior();
	private KnifeBehavior knife = new KnifeBehavior();
	private AxeBehavior axe = new AxeBehavior();
	
	protected WeaponBehavior weapon;

	public BowAndArrowBehavior getBowAndArrow() {
		return bowAndArrow;
	}

	public SwordBehavior getSword() {
		return sword;
	}

	public KnifeBehavior getKnife() {
		return knife;
	}

	public AxeBehavior getAxe() {
		return axe;
	}

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}

	public void fight() {
		log.info("This is " + this.getClass().getSimpleName());
		weapon.useWeapon();
	}
	
	public static void main(String[] args) {
		Character character = new King();
		character.fight();
		Character character2 = new Knight();
		character2.fight();
		Character character3 = new Queen();
		character3.fight();
		Character character4 = new Troll();
		character4.fight();
		character4.setWeapon(character.getBowAndArrow());
		character4.fight();
	}
}
