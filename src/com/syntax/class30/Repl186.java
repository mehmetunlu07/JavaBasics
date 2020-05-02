package com.syntax.class30;

import java.util.*;
//Create an Linked List that will store all prime numbers from 1 to 100
//Step 1. Create a method that will identify whether number is prime or not
//Step 2. Add all prime numbers into Linked List
//Print Linked List:
//Expected Output:[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

public class Repl186 {

	public static void main(String[] args) {
		List<Integer> llist = new LinkedList<>();
		//llist.add(2);
		boolean flag;
		
		for (int i = 2; i <= 100; i++) {
			flag=true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}

			}
			if (flag) {
				//System.out.print(i+" ");
				llist.add(i);
			}
		}
		//System.out.println();
		System.out.println(llist);

	}

}
