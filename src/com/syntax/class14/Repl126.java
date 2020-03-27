package com.syntax.class14;

public class Repl126 {
//	Returns every 3rd letter of the String s, 
//	starting from the first letter.
	
	static String thirdLetter(String s){
	    String str="";
	    for(int i=0;i<s.length();i+=3){
	      
	      str+=s.charAt(i);
	    }

	   return str; 
	  }
		

		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(thirdLetter("hello there")); //"hltr"
			System.out.println(thirdLetter("technology")); //"thly"
		}
	}
