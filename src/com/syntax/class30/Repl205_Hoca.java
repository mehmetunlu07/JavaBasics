package com.syntax.class30;

import java.util.*;

public class Repl205_Hoca {

	public static void main(String[] args) {
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();

		Map<String, Object> appleMap = new HashMap<String, Object>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);

		dataList.add(appleMap);

		Map<String, Object> orangeMap = new HashMap<String, Object>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);

		dataList.add(orangeMap);

		// find purchase total Price.
		double purchaseTotalPrice = 0;

		for (Map<String, Object> map : dataList) {
			String items = map.get("Items").toString();
			double price = Double.parseDouble(map.get("Price").toString());
			double quantity = Double.parseDouble(map.get("Quantity").toString());
			double lineTotal = price * quantity;

			System.out.println(
					"Items: " + items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + lineTotal);
			purchaseTotalPrice += lineTotal;
		}
		System.out.println("Your Purchase total : " + purchaseTotalPrice);
	}
}