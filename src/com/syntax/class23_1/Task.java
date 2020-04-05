package com.syntax.class23_1;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 

//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.

public class Task {
	String make;

	Task(String make) {
		this.make = make;
	}

	void price() {
		System.out.println(make + " price is normal");
	}

	void performance() {
		System.out.println("Computer performance is average");
	}

}

class Apple extends Task {
	Apple(String make) {
		super(make);
	}
	@Override
	void price() {
		System.out.println(make + " price is expensive.");
	}

	void ram() {
		System.out.println(make + "ram is high.");
	}

}

class Lenovo extends Task {
	Lenovo(String make) {
		super(make);
	}
	@Override
	void price() {
		System.out.println(make + " price is feasible");
	}

	void ram() {
		System.out.println(make + "ram is average.");
	}

}

class HP extends Task {
	HP(String make) {
		super(make);
	}
	@Override
	void price() {
		System.out.println(make + " price is cheap");
	}

}

class Dell extends Task {
	Dell(String make) {
		super(make);
	}

}
