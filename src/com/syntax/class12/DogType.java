package com.syntax.class12;

public class DogType {

	public static void main(String[] args) {
	
			Dog dog1 = new Dog();    //creating object
			dog1.breed = "Shih tzu";
			dog1.color = "yellow";
			dog1.name = "Lucy";
			dog1.age = 2;
			
			Dog dog2 = new Dog();
			dog2.breed = "Bulldog";
			dog2.color = "white";
			dog2.name = "Boby";
			dog2.age = 3;
			
			System.out.println(dog2.breed+" "+dog2.name);
			dog2.run();
			dog2.bark();
			dog2.eat();

		}

}
