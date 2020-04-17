package com.syntax.class28;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Ali");
		llist.add("Ahmet");
		llist.add("Mustafa");
		llist.add("Osman");
		llist.add("Ali");
		
		System.out.println(llist);
		System.out.println(llist.size());
		
		for(int i=0;i<llist.size();i++) {   // for loop
			System.out.print(llist.get(i)+" ");
		}
		
		System.out.println();
		for(String l:llist) {          // for each loop
			System.out.print(l+" ");
		}
		
		System.out.println();
		Iterator<String> itr=llist.iterator();   // Iterator
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	

	}

}
