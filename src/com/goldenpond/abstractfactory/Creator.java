package com.goldenpond.abstractfactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Creator {

	private static final Log log = LogFactory.getLog(Creator.class);

	private AbstractFactory factory;
	
	public Creator(AbstractFactory factory) {
		super();
		this.factory = factory;
	}

	public void createProduct() {
		AbstractPartA partA = factory.createPartA();
		AbstractPartB partB = factory.createPartB();
		AbstractPartC partC = factory.createPartC();
		log.info("Product was created using " + partA.getClass().getSimpleName() +
				" + " + partB.getClass().getSimpleName() + 
				" + " + partC.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		AbstractFactory factoryA = new FactoryA();
		Creator creator = new Creator(factoryA);
		creator.createProduct();
		
		AbstractFactory factoryB = new FactoryB();
		Creator creator2 = new Creator(factoryB);
		creator2.createProduct();
	}
}
