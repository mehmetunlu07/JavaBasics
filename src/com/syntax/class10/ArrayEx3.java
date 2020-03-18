package com.syntax.class10;

public class ArrayEx3 {

	public static void main(String[] args) {
//		Create an array of countries. 
//		While retrieving all values from an array print capital for each country. (use 2 different loops).

		String countries[] = { "USA", "Turkey", "France", "Germany", "Holland" };
		for (String i : countries) {   //Advanced for
			//System.out.println(i);
			switch (i) {
			case "USA":
				System.out.println("the capital of USA is Washington D.C.");
				break;
			case "Turkey":
				System.out.println("the capital of Turkey is Ankara");
				break;
			case "France":
				System.out.println("the capital of France is Paris");
				break;
			case "Germany":
				System.out.println("the capital of Germany is Berlin");
				break;
			case "Holland":
				System.out.println("the capital of Holland is Amsterdam");
				break;
			default:
				System.out.println("Invalid");
			}
		}
			System.out.println("******************** Regular for***********************");
			
			for (int j=0;j<countries.length;j++) {   //Advanced for
			
				switch (countries[j]) {
				case "USA":
					System.out.println("the capital of USA is Washington D.C.");
					break;
				case "Turkey":
					System.out.println("the capital of Turkey is Ankara");
					break;
				case "France":
					System.out.println("the capital of France is Paris");
					break;
				case "Germany":
					System.out.println("the capital of Germany is Berlin");
					break;
				case "Holland":
					System.out.println("the capital of Holland is Amsterdam");
					break;
				default:
					System.out.println("Invalid");
				}
		   }
	}

}
