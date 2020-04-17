package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;

//4. Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.
public class Task4 {
	public static void main(String[]args) {
	ArrayList<Integer> even=new ArrayList<>();
	
	for(int i=2;i<=50;i+=2) {
	even.add(i);
	}
	System.out.println(even+" ");
	
	Iterator<Integer> e=even.iterator();
	while(e.hasNext()) {
		if(e.next() % 5==0) {
			e.remove();
		}
	}
	System.out.print(even);
	
	
}
}
