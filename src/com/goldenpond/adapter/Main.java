package com.goldenpond.adapter;

import com.goldenpond.utils.Print;


public class Main {

	public void callAdaptee() {
		Target target = new Adapter();
		Print.ln("client is calling Target's request");
		target.request();
	}

	public static void main(String[] args) {
		Main client = new Main();
		client.callAdaptee();
	}
}
