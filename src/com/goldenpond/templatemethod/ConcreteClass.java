package com.goldenpond.templatemethod;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConcreteClass extends AbstractClass {

	private static final Log log = LogFactory.getLog(ConcreteClass.class);

	@Override
	protected void primitiveOperation2() {
		// TODO Auto-generated method stub
		log.info("Implemented primitiveOperation2");
	}

}
