package com.syntax.class11;

public class Task6 {

	public static void main(String[] args) {
		// You have a String a=“Is it saturday? Is it raining? 
		//Do we have a Java Class today?” How would you find out how many sentences are in that String?
		int counter=0;
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] b=a.split("\\?");
		for(String i:b) {
			counter++;
		}
		System.out.println(counter);

	}

}
