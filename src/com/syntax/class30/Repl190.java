package com.syntax.class30;

import java.util.*;

//Create a Set and and below values to it. 
//[third, first, second]
//Print HashSet and then remove all the elements from Hashset and print it again.
//Expected Output:
//[third, first, second]
//[]
public class Repl190 {
	public static void main(String[] args) {
		Set<String> hset = new LinkedHashSet<>();
		hset.add("third");
		hset.add("first");
		hset.add("second");

		System.out.println(hset);

		hset.removeAll(hset);

		System.out.println(hset);

	}

}