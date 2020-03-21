package com.syntax.class11;
import java.util.Scanner;
public class Repl97 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String given = inp.nextLine();
		    given=given.replace(" ","");
		    String revers="";
		    for(int i=given.length()-1;i>=0;i--){
		       revers+= given.charAt(i);
		    }
		    
		    if(revers.equalsIgnoreCase(given)){
		      System.out.println(true);
		    } else{
		      System.out.println(false);
		    }
		   	
		   	
		  }
		}