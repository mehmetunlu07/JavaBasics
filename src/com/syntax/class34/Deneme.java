package com.syntax.class34;

public class Deneme {

	static void checkTemp(int temperature) {

		if (temperature < 32) {
			throw new RuntimeException("It is freezing");
		}

	}

	public static void main(String[] args) {
		try {
		checkTemp(25);
		}catch(RuntimeException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}

}