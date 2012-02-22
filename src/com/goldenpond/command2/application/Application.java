package com.goldenpond.command2.application;

import java.util.ArrayList;
import java.util.List;

public class Application {

	private Menu[] menus;
	private List<Document> docs = new ArrayList<Document>();
	private Document activeDoc;

	Application() {
		super();
		init();
	}

	private void init() {
		menus = new Menu[1];
		menus[0] = new Menu("File");
		menus[0].add(new MenuItem("Open File..."));
		menus[0].add(new MenuItem("Paste"));
	}

	public void add(Document doc) {
		docs.add(doc);
		this.activeDoc = doc;
	}

	public void open() {
		for (Menu menu : menus) {
			for (MenuItem item : menu.getItems()) {
				if ("Open File...".equals(item.getName())) {
					item.onClick(new OpenCommand(this));
					return;
				}
			}
		}
	}

	public void paste() {
		for (Menu menu : menus) {
			for (MenuItem item : menu.getItems()) {
				if ("Paste".equals(item.getName())) {
					item.onClick(new PasteCommand(this.activeDoc));
					return;
				}
			}
		}
	}
}
