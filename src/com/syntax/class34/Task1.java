package com.syntax.class34;
//1.Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception if
// age is less than 16.
//2.Create a method checkUserName that will throw a runtime exception. Method should throw an exception when 
// entered username is less than 5 characters.
public class Task1 {

	public static void main(String[] args) {
		ageElligibility(10);
		checkUserName("John");
		
	}
	
/**
 * This method throws exception if age is smaller than 16	
 * @param age
 */
	public static void ageElligibility(int age) {
		if(age<16) {
			throw new RuntimeException("Your are not elligible!");
		}
	}
/**
 * 	This method throws exception if ageuserName is shorter than 5
 * @param userName
 */
	public static void checkUserName(String userName) {
		if(userName.length()<5) {
			throw new RuntimeException("Your userName is too short!");
		}
		
	}

}
