package com.syntax.class14;

public class Repl125 {
	 static String mixString(String s1, String s2){
	     String mix="";
	    for(int i=0;i<s1.length();i++){
	      mix=mix+s1.charAt(i)+s2.charAt(i);
	      
	    }
	    
	    return mix;
	  }
		
		
		//test case below (dont change):
		public static void main(String[] args){
		  String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
		}
	}