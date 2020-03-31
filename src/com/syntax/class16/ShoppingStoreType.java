package com.syntax.class16;

public class ShoppingStoreType {
	public static void main(String[]args) {
	   ShoppingStore obj=new ShoppingStore("Blanket",9.998,10);
	   ShoppingStore obj1=new ShoppingStore("Mattress",4.3918,100);
	   double total1=obj.itemTotalPrice();
	   double total2=obj1.itemTotalPrice();
	   
	   System.out.println("Your purchase "+(total1+total2)+" Today");
	 
	}
}