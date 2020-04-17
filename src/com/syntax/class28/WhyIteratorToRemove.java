package com.syntax.class28;

import java.util.*;

public class WhyIteratorToRemove {

	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("water");
		drinks.add("milk");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("tea");
		drinks.add("tea");
		drinks.add("coffee");
		
		System.out.println(drinks);
		
		//we need to remove all milk and tea String objects
		for(int i=0; i<drinks.size(); i++) {
			
			if(drinks.get(i).equals("milk") || drinks.get(i).equals("tea")){
				drinks.remove(i);
			}
		}
		
		System.out.println(drinks);
		
		// Using iterator     ///iterator da ikinci milk ve tea leri gormuyor, remove yapinca sira bir kayiyor.
		
//		Iterator<String> itr=drinks.iterator();
//		while(itr.hasNext()) {
//			if(itr.next().equals("milk")||itr.next().equals("tea")) {
//				itr.remove();
//			}
//		}
//		System.out.println(drinks); 
//		
		
		
	}
}
