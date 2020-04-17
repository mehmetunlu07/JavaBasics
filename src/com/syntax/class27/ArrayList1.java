package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;

//Create an arraylist of cars and retrieve all the values using 3 different ways.

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<>();
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Dodge");
		
		for(int i=0;i<cars.size();i++) {            // for loop
			System.out.print(cars.get(i)+" ");
		}
		
		System.out.println();
		
		for(String i:cars) {            // for each loop
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		Iterator<String> itr=cars.iterator();     // using iterator
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
