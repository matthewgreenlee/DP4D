package com.goldenpond.observer.example;

import java.util.Observable;

public class Newspaper extends Observable {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		if (content != null && !content.equals(this.content)) {
			this.content = content;
			setChanged();
			notifyObservers(this.content);
		}
	}
}
