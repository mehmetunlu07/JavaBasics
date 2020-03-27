package com.syntax.class14;

public class Repl129 {
//	Return a new String built from s that has every instance of the search term surrounded by parentheses
//	See below examples.
	
	 static String surround(String s, char search_term){
		    String newStr="";
		    for(int i=0;i<s.length();i++){
		    	if(s.charAt(i)==search_term) {
		    		newStr=newStr+"("+s.charAt(i)+")";
		    	}else {
		    		newStr=newStr+s.charAt(i);
		    	}
		      
		    }
		    
	 return newStr;	    
     }
	 //**************ikinci yontemle cozum**********************
	 static String surround1(String s, String search_term) {
		 String str="";
		 str=s.replace(search_term,"("+search_term+")");
		 
		 return str;
		 
	 }
			
			//test case below (dont change):
			public static void main(String[] args){
				System.out.println(surround("abcabcabc",'c')); //"ab(c)ab(c)ab(c)"
				
				System.out.println(surround1("technology","o")); //"techn(o)l(o)gy"
			}
		}