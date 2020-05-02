package com.syntax.class30;
import java.util.*;
//Create a method that will remove an element based on the specified condition from given List and return new List;
//Expected Output:  [USA, Kazakhstan, Pakistan, Russia]
public class Repl188 {
	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		Iterator<String> itr=countries.iterator();
		while(itr.hasNext()) {
			if(itr.next().startsWith("A")){
				itr.remove();
			}
		}
		System.out.println(countries);
		
		
	}
}