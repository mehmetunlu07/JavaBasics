package com.syntax.class30;



import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		//lets create a grocery map (item, quantity)in which we do not care about the order
		Map<String, Integer> grocery=new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);
		System.out.println(grocery);

		//create a map of items to buy (item, quantity) in which we want save the order
		Map<String, Integer> household=new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitizer", 2);
		household.put("paper towel", 3);
		household.put("toilet paper", 10);
		household.put("face mask", 50);
		System.out.println(household);
		
		//create a map in which we store all previous items in ascending order
		Map<String, Integer> shopping =new TreeMap<>(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		System.out.println("------------For each loop------------------");
		//get all keys using loop
		//Set<String> keys=shopping.keySet();
		for(String key:shopping.keySet()) {
			System.out.println("Key: "+key);
		}
		//get all values using loop
		for(Integer value:shopping.values()) {
			System.out.println("Value: "+value);
		}
		for(Entry<String,Integer> entry:shopping.entrySet()) {
			System.out.println("Key: "+ entry.getKey()+ "  Value:"+entry.getValue());
		}
		
		System.out.println("------------Iterator------------------");
		//get all keys using iterator
		Iterator<String> it=shopping.keySet().iterator();
		while(it.hasNext()) {
			System.out.println("Key="+it.next());
		}
		
		//get all values using iterator
		Iterator<Integer> itr=shopping.values().iterator();
		while(itr.hasNext()) {
			System.out.println("value = "+itr.next());
		}
		//get all entries using iterator
		Iterator<Entry<String,Integer>> i=shopping.entrySet().iterator();
		while(i.hasNext()) {
			Entry<String,Integer> e=i.next();
			System.out.println("Key= "+e.getKey()+  "  Value: "+e.getValue());
		}
	}
}
