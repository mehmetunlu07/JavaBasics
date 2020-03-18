package com.syntax.class10;

import java.util.Scanner;
public class Repl77 {

	public static void main(String[] args) {    // 1 den 5 e kadar olan sayilari scannerdan alip tersden yazdir
		 Scanner scan=new Scanner(System.in);
		    int num[]=new int[5];
		    
		    System.out.println("Input:");
		    for(int i=0;i<num.length;i++){
		        num[i]=scan.nextInt();
		    }
		    
		    System.out.println("Output:");
		    for(int i=num.length-1;i>=0;i--){
		        System.out.println(num[i]);
		    }

	}

}
