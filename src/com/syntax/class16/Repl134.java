package com.syntax.class16;
//Create the maxLength method that will accept String array of words and return the word with the largest length.
//Method should visible only within same package!

public class Repl134 {
	static String maxLength(String [] words){
	    String max=words[0];
	    for(int i=0;i<words.length;i++){
	       if(words[i].length()>max.length()){
	         max=words[i];
	       }
	    }
	    return max;
	  }
		
		public static void main(String[] args) {
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr));
			//should print "this is long"
		}
		
	}