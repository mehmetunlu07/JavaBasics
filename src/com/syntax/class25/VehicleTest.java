package com.syntax.class25;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle bus=new Bus("red");
		bus.total();
		bus.drive();
		bus.stop();
		bus.start();
		bus.brake();
		
		System.out.println();
		System.out.println(bus.color);
		System.out.println(Vehicle.totalVehicles);
		

	}

}
