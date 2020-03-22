package com.syntax.class12;

public class Phone {
	
	String brand;
	int size;
	int batLife;
	int ram;
	
	void call() {
		System.out.println(brand+" can call for "+batLife+" hours");
	}
	void photo() {
		System.out.println(brand+" can take photo many times");
	}
	void liveCall() {
		System.out.println(brand+ " can perform live calls up to "+ batLife);
	}

	

}
