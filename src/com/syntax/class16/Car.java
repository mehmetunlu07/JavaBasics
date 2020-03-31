package com.syntax.class16;

public class Car {
	 String make, model;
	  int numberOfDoors, topSpeed;
	  double price;
	  
	  Car(String make1, String model1, int numberOfDoors1, int topSpeed1,double price1){
	    make=make1;
	    model=model1;
	    numberOfDoors=numberOfDoors1;
	    topSpeed=topSpeed1;
	    price=price1;
	  }
	  Car(String make1, String model1, int topSpeed1,double price1){
	    make=make1;
	    model=model1;
	    numberOfDoors=4;
	    topSpeed=topSpeed1;
	    price=price1;
	  }
	  Car(int numberOfDoors1, int topSpeed1,double price1){
	    make="unknown";
	    model="unknown";
	    numberOfDoors=numberOfDoors1;
	    topSpeed=topSpeed1;
	    price=price1;
	  }
	  Car(String make1, String model1,int numberOfDoors1){
	    make=make1;
	    model=model1;
	    numberOfDoors=numberOfDoors1;
	    topSpeed=90;
	    price=0;
	  }
	  
	  void display(){
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	  }
	  
	}