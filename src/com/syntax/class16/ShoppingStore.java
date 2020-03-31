package com.syntax.class16;

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
		double totalPrice=this.price*this.quantity;
	    System.out.println(this.item+" Total Value "+totalPrice);
	    return totalPrice;
	    
	  }

}