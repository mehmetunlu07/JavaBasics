package com.syntax.class25GroupHW;

public class CarTest {

	public static void main(String[] args) {
		Car s=new Sedan(20000,"red",21);
		System.out.println("Discounted price for "+s.color+" Sedan is "+s.calculateSalePrice());
		
		Car t=new Truck(30000,"black",4000);
		System.out.println("Discounted price for "+t.color+" Truck is "+t.calculateSalePrice());

	}

}
