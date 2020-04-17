package com.syntax.class28;
//1.Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. 
//  Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute. 
//  Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class. 
//2.Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.  
//  Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList. 
//  Using for loop/advanced for loop/ iterator access all methods of the class.

public abstract class Insurance {
	String insuranceName;
	public Insurance(String insuranceName) {
	this.insuranceName=	insuranceName;
	}
	
	abstract void getQuote();
	abstract void cancelInsurance();
	}

class Car extends Insurance{
	String carModel;
	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}

	@Override
	void getQuote() {
		System.out.println("Car insured");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("Car insurance cancelled");
		
	}
	
}
class Pet extends Insurance{
	String petType;
	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}

	@Override
	void getQuote() {
		System.out.println("Pet insured");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("Pet insurance cancelled");
		
	}
}
class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	void getQuote() {
		System.out.println("Health insurance started");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("Health insurance cancelled");
		
	}
}