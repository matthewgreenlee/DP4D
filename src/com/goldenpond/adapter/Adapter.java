package com.goldenpond.adapter;

import com.goldenpond.utils.Print;

public class Adapter implements Target {

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		Print.ln("delegate Target's request to adaptee");
		adaptee.specificRequest();
	}

}
