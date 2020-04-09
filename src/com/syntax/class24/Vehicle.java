package com.syntax.class24;


//Create a class Bus, which will be concrete child class of the vehicle class.
//Create a SchoolBus class that will be a subclass of the Bus and override method drive() and stop().
//Create an array of vehicles and see which methods will be available and see the output of the program
public abstract class Vehicle {

	static int totalVehicles;
	String color;
	
	Vehicle(String color){
		this.color=color;
		totalVehicles++;
	}
	
	public static void total() {
		System.out.println("we build "+totalVehicles);
	}
	
	public void drive() {
		System.out.println("Vehicle drives");
	}
	
	public void stop() {
		System.out.println("Vehicle stops");
	}
	
	public abstract void start();
	
	public abstract void brake();
}
class Bus extends Vehicle{
	Bus(String color){
		super(color);
	}
	@Override
	public void start() {
		System.out.println("Bus has start");
		
	}

	@Override
	public void brake() {
		System.out.println("Bus has brakes");
		
	}
	
}
class SchoolBus extends Bus{

	SchoolBus(String color) {
		super(color);
	}
	public void drive() {
		System.out.println("SchoolBus drives");
	}
	
	public void stop() {
		System.out.println("SchoolBus stops ");
	}
	
}
abstract class Car extends Vehicle{
	String carType;
	
	Car(String color, String carType){
		super(color);
		this.carType=carType;
	}
	
	public void brake() {
		System.out.println(carType+ " have brakes");
	}
	
}
class Tesla extends Car{
	
	String make;
	
	Tesla(String color, String carType, String make){
		super(color, carType);
		this.make=make;
	}
	
	public void drive() {
		System.out.println(make+" drives on autopilot");
	}

	@Override
	public void start() {
		System.out.println(make+" starts remotely");
	}
	
	public void display() {
		System.out.println("We have "+color+" "+make+" "+carType);
	}
}

class Toyota extends Car{
	
	String make;

	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
	}

	@Override
	public void start() {
		System.out.println(make+ " starts keyless");
	}	
}




