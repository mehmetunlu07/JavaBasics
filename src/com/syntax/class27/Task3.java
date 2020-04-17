package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;

//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
public class Task3 {

	public static void main(String[] args) {
		ArrayList<String> drink=new ArrayList<>();
		drink.add("cola");
		drink.add("soda");
		drink.add("wisky");
		
		System.out.println(drink);
		
		for(int i=0;i<drink.size();i++) {
			if(drink.get(i).contains("a")||drink.get(i).contains("e")) {
				drink.set(i, "water");
			}
		}
		System.out.println(drink);	
		
		System.out.println("------------------Iterator--------------------");
		drink.set(0,"cola");
		drink.set(1,"soda");
		System.out.println(drink);
		
		Iterator<String> d=drink.iterator();
		while(d.hasNext()){
			if(d.next().contains("a")) {
				d.remove();
			}
		}
		System.out.println(drink);
		

	}

}
