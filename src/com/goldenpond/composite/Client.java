package com.goldenpond.composite;


// Client know nothing about Tree implementation(Composite and Leaf) except Component
public class Client {

	private Component tree;

	public Component getTree() {
		return tree;
	}

	public void setTree(Component tree) {
		this.tree = tree;
	}
	
	public void printTree() {
		System.out.println(tree);
	}
}
