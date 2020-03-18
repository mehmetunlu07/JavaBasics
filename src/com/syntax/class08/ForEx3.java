package com.syntax.class08;

public class ForEx3 {

	public static void main(String[] args) {
		// print 15 to 35 and do not print numbers divisible by 2 and 3
		
		for(int i=15;i<=35;i++) {
			if(i%2==0 && i%3==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
		
	}

}
