package com.syntax.class09;

public class Hw2 {

	public static void main(String[] args) {
		
//				Create an array of names and store all names of your group. 
//				Then print your name from that array. (use 2 different ways of creating an array).
		
				
		String[] names= {"Ali","Ahmet","Mustafa","Mehmet","Max"};  //1.way
		System.out.println(names[3]);
		
		String[] names1;
		names1=new String[5];
		names1[0]="Ali";
		names1[1]="Ahmet";
		names1[2]="Mustafa";
		names1[3]="Mehmet";
		names1[4]="Max";
		System.out.println(names1[3]);
		
		

	}

}
