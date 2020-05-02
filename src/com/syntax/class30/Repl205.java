package com.syntax.class30;
import java.util.*;
import java.util.Map.*;

//Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList. 
//Step 2: Create appleMap<String, Object> and add below pairs into it. 
//"Items", "Apple"
//"Price", 20.00
//"Quantity", 10
//Step 3: Add appleMap to dataList. 
//Step 4: Create orangeMap<String, Object> and add below pairs into it. 
//"Items", "Orange" 
//"Price", 21.99
//"Quantity", 10
//Step 5: Add orangeMap to dataList. 
//Step 6: Create a loop from dataList. 
//Step 7: Retrieve each Key and store it in a variable. 
//Step 8: calculate the subtotal of each object. 
//Step 9: Print the values of each Iteration same as shown below in Output example. 
//Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase. 
//Step 11: After Loop Print the value of Total Purchase. 
//NOTE: as the values are Object you have to do casting properly while retrieving from for each map. 
//Output: 
//Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
//Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998
//Your Purchase total : 419.9
public class Repl205 {

	public static void main(String[] args) {
			
		Map<String,Object> appleMap=new LinkedHashMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10.0);
		
		List<Map<String,Object>> dataList=new ArrayList<>();
		dataList.add(appleMap);
		
		Map<String,Object> orangeMap=new LinkedHashMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10.0);
		
		dataList.add(orangeMap);
		double total=0;
		for(Map<String,Object> data:dataList){
			Set<String> keys=data.keySet();
			Iterator<String> itr=keys.iterator();
			while(itr.hasNext()) {
				Object a=data.get(itr.next());
				Object b=data.get(itr.next());
				Object c=data.get(itr.next());
				double b1=(Double)b;
				double c1=(Double)c;
				double subtotal=b1*c1;
				System.out.println("Items: "+a+" Price: "+b+" Quantity: "+c+" SubTotal: "+subtotal);
				total+=subtotal;
			}
		}
		System.out.println("Your Purchase total : "+total);
	}

}
