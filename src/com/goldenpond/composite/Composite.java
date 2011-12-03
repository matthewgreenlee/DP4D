package com.goldenpond.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Composite extends Component {

	// elems works as a container of components, no getter and setter needed
	private Collection<Component> elems = new ArrayList<Component>();
	
	public void add(Component component) {
		elems.add(component);
	}

	public void remove(Component component) {
		elems.remove(component);
	}

	@Override
	public String toString() {
		return "Composite [elems=" + elems + ", name=" + name + "]";
	}
}
