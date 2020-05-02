package com.syntax.class30;

//Create Linked List that will store first 10 numbers of fibonacci series
//Print number from Linked List 1 by 1 all in 1 line
//Expected Output:0 1 1 2 3 5 8 13 21 34
import java.util.*;

public class Repl184 {

	public static void main(String[] args) {
		List<Integer> llist = new LinkedList<>();
		llist.add(0);
		llist.add(1);
		for (int i = 2; i < 10; i++) {
			Integer j = llist.get(i - 2) + llist.get(i - 1);
			llist.add(j);
		}
		Iterator<Integer> itr = llist.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}