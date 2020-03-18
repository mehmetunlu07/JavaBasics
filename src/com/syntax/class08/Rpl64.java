package com.syntax.class08;

import java.util.Scanner;

//import java.util.Scanner;
public class Rpl64 {

	public static void main(String[] args) {
		 Scanner inp=new Scanner(System.in);
		    int end;
		    System.out.print("Int:");
		    //write your code below
		    end=inp.nextInt();
		    end*=2;
		    for(int i=0;i<end;i++){
		      System.out.print(i+" ");
		    }
	}

}
