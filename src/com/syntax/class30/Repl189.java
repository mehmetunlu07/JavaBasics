package com.syntax.class30;

import java.util.*;

public class Repl189 {
	public static void main(String[] args) {
		Set<Integer> hset = new HashSet<>();
		hset.add(111);
		hset.add(111);
		hset.add(111);
		hset.add(999);
		hset.add(999);
		hset.add(999);

		for (int i : hset) {
			System.out.println(i);
		}

	}

}