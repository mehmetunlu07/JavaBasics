package com.syntax.class16;  //Repl-142

public class ShoppingStoreType {
	public static void main(String[]args) {
	   ShoppingStore obj=new ShoppingStore("Blanket",9.998,10);
	   ShoppingStore obj1=new ShoppingStore("Mattress",43.918,10);
	   double total1=obj.itemTotalPrice();
	   double total2=obj1.itemTotalPrice();
	   
	   System.out.println("You purchased "+(total1+total2)+" Today");
	 
	}
}

//String strDouble = String.format("%.2f", 2.00023); 
//System.out.println(strDouble); // print 2.00

//DecimalFormat df = new DecimalFormat("#.##"); 
//String formatted = df.format(2.00023);

