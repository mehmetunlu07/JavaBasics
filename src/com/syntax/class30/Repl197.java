
package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Repl197 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Street", "Partrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");

		Set<Entry<String, String>> set = map.entrySet();

		for (Entry<String, String> e : set) {
			System.out.println(e.getValue());
		}

	}

}