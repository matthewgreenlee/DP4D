package com.goldenpond.bridge;

public class BridgeTest {

}
abstract class Abstraction {
	private Implementor impl;
	public void Operation() {
		impl.OperationImpl();
	}
}
class RefinedAbstraction extends Abstraction{}
interface Implementor {
	public abstract void OperationImpl();
}
class ConcreteImplementorA implements Implementor {

	@Override
	public void OperationImpl() {
		
	}
}
class ConcreteImplementorB implements Implementor {

	@Override
	public void OperationImpl() {
		
	}
}