package com.syntax.class09;

public class NestedLoop1 {     //using nested loop to print clock (h:m)

	public static void main(String[] args) {
		for(int i=0;i<24;i++) {
			for(int j=0;j<60;j++) {
				if(j<10) {
				System.out.println(i+":0"+j);
				}else {
					System.out.println(i+":"+j);
				}
			}
		}

	}

}
