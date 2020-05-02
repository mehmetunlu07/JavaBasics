package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;
import java.util.TreeMap;

//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.
public class Task1 {

	public static void main(String[] args) {
		Map<String, String> country=new TreeMap<>();
		country.put("Belgium","Brussels");
		country.put("Germany","Berlin");
		country.put("USA","Washington DC");
		country.put("England","London");
		
		System.out.println(country);
		
		System.out.println("*****************For each loop***************");
		for(String c:country.keySet()){
			System.out.print(c+" ");
		}
		
		System.out.println();
		for(String cp:country.values()) {
			System.out.print(cp+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		for(Entry<String,String> e:country.entrySet()) {
			System.out.println("Key:"+e.getKey()+"  Value:"+e.getValue());
		}
		
		System.out.println();
		System.out.println("*****************Iterator***************");
		
		Iterator<Entry<String,String>> itr=country.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String,String> e=itr.next();
			System.out.println(e+" --  "+e.getKey()+" --  "+e.getValue());
		}
		
//		System.out.println("-------------------------");
//		Iterator<String> values=country.values().iterator();
//		while(values.hasNext()) {
//			System.out.println(values.next());
//		}
	}

}
