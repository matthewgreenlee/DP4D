package com.goldenpond.bridge;

public class BridgeExample {

}
abstract class Vehicle {

	private PoweredVehicle powerBy = new PoweredVehicleFactory().getPoweredVehicle();

	public int oilConsumption() {
		return powerBy.getOil();
	}
}
class Car extends Vehicle {
	private int personNumber;
}
class Van extends Vehicle {
	private int goodsWeight;
}
class Coach extends Vehicle {
	private int hight;
}
abstract class PoweredVehicle {
	protected int oil;

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
}
class HybridVehicle extends PoweredVehicle {}
class GasolineVehicle extends PoweredVehicle {}
class ElectricVehicle extends PoweredVehicle {}
class PoweredVehicleFactory {
	public PoweredVehicle getPoweredVehicle() {
		return null;
	}
}