package com.goldenpond.templatemethod;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractClass {

	private static final Log log = LogFactory.getLog(AbstractClass.class);

	// the skeleton of algorithm is stable
	public void templateMethod() {
		
		primitiveOperation1();
		primitiveOperation2();
		primitiveOperation3();
	}

	private void primitiveOperation1() {
		// TODO Auto-generated method stub
		log.info("Stable primitiveOperation1");
	}

	protected abstract void primitiveOperation2();

	private void primitiveOperation3() {
		// TODO Auto-generated method stub
		log.info("Stable primitiveOperation3");
	}
	
	public static void main(String[] arg) {
		AbstractClass instance = new ConcreteClass();
		instance.templateMethod();
	}
}
