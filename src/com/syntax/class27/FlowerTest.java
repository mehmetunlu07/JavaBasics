package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		
		// store flowers into array
		Flower [] flowerArray={new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};

		//store flowers into arraylist
		ArrayList<Flower> flowers=new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		//flowers.add("Rose");cannot add String Object into ArrayList of Flower Objects
		
		System.out.println("----------------For Loop----------------");
		for(int i=0;i<flowers.size();i++) {   //for loop
			Flower obj=flowers.get(i);
			System.out.print(obj.type+"      ");
			obj.bloom();
		}
		System.out.println();
		System.out.println("----------------For Each Loop----------------");
		
		for(Flower f:flowers) {    //for each loop
			System.out.print(f.type+"     ");
			f.bloom();
		}
		
		System.out.println();
		System.out.println("----------------Iterator----------------");
		
		Iterator<Flower> f=flowers.iterator();
		while(f.hasNext()) {
			Flower obj=f.next();
			System.out.print(obj.type+"       ");
			obj.bloom();
		}
		
		System.out.println();
//		System.out.println("---------------New Iterator----------------");
//		Iterator<Flower> flw=flowers.iterator();
//		while(flw.hasNext()) {
//			Flower obj=flw.next();
//			
//			if(obj.equals(new Tulip("Tulip"))) {
//				flw.remove();
//			}
//			System.out.print(obj.type+"       ");
//			obj.bloom();
//			
//		}
//		
//		System.out.print(flowers+" ");
		
	}
}
