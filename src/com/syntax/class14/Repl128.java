package com.syntax.class14;

public class Repl128 {
//count the number of vowels in the string s.  Assume s is all lowercase.
	static int countVowels(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
		  char c=s.charAt(i);
		    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
		      count++;
		    }
		  
		}
		
		return count;
	}
	
	//*******************ikinci yontemle cozum***********************
	
	static int countVowels1(String s) {
		s=s.replaceAll("[^AaEeIiOoUu]","");
		return s.length();
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
		System.out.println("************ikinci yontem**************");
		System.out.println(countVowels1("obama")); //3
		System.out.println(countVowels1("happy friday! i love weekends")); //9
	}
}