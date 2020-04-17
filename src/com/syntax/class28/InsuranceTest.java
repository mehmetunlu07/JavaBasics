package com.syntax.class28;
import java.util.*;
public class InsuranceTest {

	public static void main(String[] args) {
		
		ArrayList<Insurance> ins=new ArrayList<>();
		ins.add(new Car("Global","BMW"));
		ins.add(new Pet("Global","Pupy"));
		ins.add(new Health("Global"));
		
		for(int i=0;i<ins.size();i++) {
			ins.get(i).getQuote();
			ins.get(i).cancelInsurance();
			System.out.println("-------------------");
		}
		
		for(Insurance i:ins) {
			i.getQuote();
			i.cancelInsurance();
		}
		System.out.println("------Iterator----------");
		Iterator<Insurance> itr=ins.iterator();
		while(itr.hasNext()) {
			itr.next().getQuote();
			//itr.next().cancelInsurance();  // object sayisi 3 oldugu icin exception verir
			System.out.println("**********************");
		}
		
		
		

	}

}
