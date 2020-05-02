package com.syntax.class30;
//Create a Linked List that will store Integer Objects from 50-100.
//Once Linked List is created remove all numbers that are not divisible by 3.
//Print Linked List
//Expected Output  [51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repl183 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		for (int i = 50; i <= 100; i++) {
			list.add(i);
		}
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int a = itr.next();
			if (a % 3 != 0) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

}