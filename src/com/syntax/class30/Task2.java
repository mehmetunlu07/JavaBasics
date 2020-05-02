package com.syntax.class30;
//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		Map<Integer, String> bestbuy=new LinkedHashMap<>();
		bestbuy.put(7664847, "Printer");
		bestbuy.put(7664848, "Sony Tv");
		bestbuy.put(7664849, "Computer");
		bestbuy.put(7664850, "Headphone");
		System.out.println(bestbuy);
		
		//Set<Entry<Integer,String>>items=bestbuy.entrySet();
		System.out.println("--------------------Iterator-----------------------");
		Iterator<Entry<Integer,String>> itr=bestbuy.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer,String> e=itr.next();
			String keyValue=e.getKey()+" :: "+e.getValue();
			System.out.println(e+" --- "+keyValue);
		}
		

	}

}
