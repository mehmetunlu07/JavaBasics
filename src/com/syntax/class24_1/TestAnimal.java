package com.syntax.class24_1;

import com.syntax.class24_1.Animal;
import com.syntax.class24_1.Dog;
import com.syntax.class24_1.LivingBeing;

 public class TestAnimal {

	public static void main(String args[]) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object

		a.move();// runs the method in Animal class
		b.move();// Runs the method in Dog class
		
		System.out.println("-----------------------");
		
		LivingBeing l=new LivingBeing();
		LivingBeing l1=new Animal();
		LivingBeing l2=new Dog();
		l.move();
		l1.move();
		l2.move();
	}
}