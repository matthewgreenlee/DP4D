package com.goldenpond.composite;


public class Main {

	private static Component constructTree() {
		
		// top-down construction
		// level 0
		Component component01 = new Composite();
		component01.setName("component01");

		// level 1
		Component component02 = new Composite();
		component02.setName("component02");
		Component component03 = new Leaf();
		component03.setName("component03");
		component01.add(component02);
		component01.add(component03);
		
		// level 2
		Component component04 = new Leaf();
		component04.setName("component04");
		Component component05 = new Leaf();
		component05.setName("component05");
		component02.add(component04);
		component02.add(component05);
		
		return component01;
	}
	
	public static void main(String[] args) {
		
		Component tree = constructTree();
		Client client = new Client();
		client.setTree(tree);
		client.printTree();
	}
}
