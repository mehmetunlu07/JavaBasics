package com.syntax.class12;

public class Task2 {

	String createEmail(String name, String lastname, String emailtype) {

		String email = "";
		email = name + lastname + "@" + emailtype + ".com";
		return email;
	}
	boolean isPrime(int num) {
		boolean prime=true;
		if(num>0) {
			
			for(int i=2; i<num;i++) {
				if(num%i==0) {
					prime=false;
					break;
				}else {
					prime=true;
				}
			}
			
		}else {
			System.out.println("Enter a number greater than 0");
		}
		
		return prime;
		
	}
	
	
	public static void main(String[] args) {
		//1.Create a method createEmail(). Based on provided users name, lastName and email type, 
//			your method should return complete email Address. Example: johnsnow@gmail.com or johnsnow@yahoo.com*
		//2.Write a method to return whether given number is prime or not?
		
		Task2 obj = new Task2();
		String email=obj.createEmail("max","turner","gmail");
		System.out.println("Your e-mail is: "+ email);
		
		System.out.println("*************** Checking prime number******************");
		
		boolean prime=obj.isPrime(17);
		
		if(prime) {
			System.out.println("Checking the prime number is "+prime);
		}else {
			System.out.println("Checking the prime number is "+prime);	
		}
		
		
		
}
}
