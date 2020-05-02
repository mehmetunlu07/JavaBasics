package com.syntax.class29;

import java.util.*;
import java.util.Iterator;
import java.util.Set;

public class InsuranceTest {

	public static void main(String[] args) {
		
		Set<Insurance> hset=new LinkedHashSet<>();
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Progressive", "Dog"));
		hset.add(new Health("BCBS"));
		
		System.out.println(hset.size());
		
		Iterator<Insurance> it=hset.iterator();
		while(it.hasNext()) {
			//Insurance obj=new Car("Geico", "BMW")
			//we need to assing it to the variable because if we use it.next() --> moves to the next element
			Insurance obj=it.next();
			obj.getQuote();
			obj.cancelInsurance();
			obj.method();
			//obj.diplay --> won't be available to insurance type
			System.out.println("----------------------");
		}
	}
}
