package com.syntax.class13;

public class Shelter {
public static void main(String[] args) {
		
		//access instance variables of different class
		Dog puppy=new Dog();
		puppy.name="Charly";
		System.out.println(puppy.name);
		
		//access static variables of different class
		System.out.println(Dog.breed);
		System.out.println(puppy.breed);
	}
}