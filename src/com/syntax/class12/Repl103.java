package com.syntax.class12;

public class Repl103 {
	String breed;
	String name;
	String color;

	void bark() {
		System.out.println(breed+" can bark");
	}

	void run() {
		System.out.println(breed+" can run");
	}

	void play() {
		System.out.println(breed+" can play");
	}

	public static void main(String[] args) {
		Repl103 obj1 = new Repl103();
		Repl103 obj2 = new Repl103();
		Repl103 obj3 = new Repl103();

		obj1.breed="Husky";
		obj1.name="Bob";
		obj1.color="white";
		
		obj2.breed = "Bulldog";
		obj2.name="Dick";
		obj2.color="black";
		
		obj3.breed = "Labrador";
		obj3.name="Doll";
		obj3.color="yellow";

		
		obj1.bark();
		obj1.run();
		obj1.play();
		
		obj2.bark();
		obj2.run();
		obj2.play();
		
		obj3.bark();
		obj3.run();
		obj3.play();

	}

}
