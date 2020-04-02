package com.syntax.class16;

import java.text.DecimalFormat;

public class ShoppingStore {
	String item;
	double price;
	int quantity;

	ShoppingStore(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	double itemTotalPrice(){
		double totalPrice=price*quantity;
		DecimalFormat obj=new DecimalFormat("#.##");
		String total=obj.format(totalPrice);
		System.out.println(item+" Total Value "+total);
	    return totalPrice;
	    
	  }

}