package com.syntax.class12;

public class Methods {

	//create a method that will say welcome 10 times
	void sayWelcome() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Welcome");
		}
	}
	
	//create method that will say any word #number of times
	void sayAnything(String word, int times) {
		
		for(int i=1; i<=times; i++) {
			System.out.println(word);
		}
	}
	
	//create a method isItRaining
	//that will accept boolean value as a param
	//and based on the value it will print message accordingly
	
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("It is raining stay home and learn Java");
		}else {
			System.out.println("It is not raining go for a walk");
		}
	}
	
	
	
	
	
	
}
