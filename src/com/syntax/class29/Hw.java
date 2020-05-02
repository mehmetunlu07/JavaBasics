package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.*;

//Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). 
//Insert 7 entries with duplicate keys and values. 
//Check how many entries you have?
//Update company on a 4th floor 
//Remove company on the 7th floor
//Print your map
public class Hw {

	public static void main(String[] args) {
		Map<Integer, String> map=new LinkedHashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "BestBuy");
		map.put(3, "BestSeller");
		map.put(4, "Times");
		map.put(5, "Git");
		map.put(2,"Amazon");
		
		System.out.println(map.size());  //5
		
		System.out.println(map);
		
		map.replace(4, "BookStore");  // replace value of key 4
		System.out.println(map);
		
		System.out.println(map.get(2));  // get value of key 2
		map.put(4, "newGoogle");   //put newGoogle to value of key 4
		System.out.println(map);
		map.remove(4);        // remove entry 4
		System.out.println(map);
		System.out.println(map.size());

	}

}
