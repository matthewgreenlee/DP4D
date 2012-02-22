package com.goldenpond.command2.application;

public class PasteCommand implements Command {

	private Document doc;

	PasteCommand(Document doc) {
		super();
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.paste();
	}

}
