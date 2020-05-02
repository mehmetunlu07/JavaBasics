package com.syntax.class30;

import java.util.*;

//Create Linked List that will store Integer Objects. Add the values below:
//111
//222
//333
//444
//555
//666
//
//Create a logic to calculate sum of the all the values in list. Print the result of sum. Expected Output:Result of sum is 2331
public class Repl187 {
	public static void main(String[] args) {
		List<Integer> llist = new LinkedList<>();
		llist.add(111);
		llist.add(222);
		llist.add(333);
		llist.add(444);
		llist.add(555);
		llist.add(666);
		int sum=0;
		
		for(int i:llist) {
			
			sum+=i;
		}
		System.out.println("Result of sum is "+sum);

	}
}