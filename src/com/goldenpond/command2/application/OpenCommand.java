package com.goldenpond.command2.application;

import java.util.Random;

import com.goldenpond.utils.Print;

public class OpenCommand implements Command {

	private Application app;

	OpenCommand(Application app) {
		super();
		this.app = app;
	}

	@Override
	public void execute() {
		String name = askForName();
		Document doc = new Document(name);
		app.add(doc);
		doc.open();
	}

	private String askForName() {
		Print.ln("prompt to input name");
		return "doc_" + new Random().nextInt(100);
	}

}
