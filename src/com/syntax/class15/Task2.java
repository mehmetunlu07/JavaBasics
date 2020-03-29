package com.syntax.class15;
//1.Write a program  that will have 4 different access levels of constructors and 
//  create 3 objects of this class: 1 - inside same class; 2 - from outside the class; 
//  3 - from different class inside different package  and observe result.
//2.Write program that have static constructor and observe result.


public class Task2 {
	
	public String name;
	public int number;
	
	public Task2(){
		System.out.println("Public constructor");
		name="Emel";
		number=1;
	}
	
	protected Task2(int num) {
		System.out.println("Protected constructor");
		number=num;
	}
	
	Task2(String str){
		System.out.println("Default constructor");
		name=str;
	}
	
	private Task2 (String s, int a) {
		System.out.println("Private constructor");
		name=s;
		number=a;
	}

	public static void main(String[] args) {
		Task2 obj1=new Task2();
		System.out.println(obj1.name+" "+ obj1.number);
		Task2 obj2=new Task2(5);
		Task2 obj3=new Task2("Haydar");
		Task2 obj4=new Task2("Bahadir", 13);
		System.out.println(obj4.name+" "+obj4.number);

	}

}
