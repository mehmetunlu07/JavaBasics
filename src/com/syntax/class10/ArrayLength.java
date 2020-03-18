package com.syntax.class10;

public class ArrayLength {

	public static void main(String[] args) {
		String[] cities= {"Washington","New York","Istanbul","Abu Dabi","Houston","Dallas"};
		System.out.println(cities[0]);
		int x=2;
		System.out.println(cities[x]);
		x+=2;
		System.out.println(cities[x]);
		System.out.println(cities[cities.length-1]);
		
		int arraySize=cities.length;   //gives the length of an array
		System.out.println(cities[arraySize-1]);//last element of array
		System.out.println("********************");
		for(int i=0;i<arraySize;i++) {
			System.out.println(cities[i]);
		}

	}

}
