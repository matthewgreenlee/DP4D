package com.goldenpond.command.application;

import com.goldenpond.utils.Print;

public class Document {

	private String name;

	Document(String name) {
		this.name = name;
	}

	public void paste() {
		Print.ln("paste from system clipboard");
	}

	public void open() {
		Print.ln("the document "+ this.name + " is open");
	}

}
