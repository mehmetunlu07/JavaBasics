package com.syntax.class26_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Repl182 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int a;
		for (int i = 1; i <= 5; i++) {
			a = scan.nextInt();
			list.add(a);             //list.add(scan.nextInt());
		}

		System.out.println(list);
		scan.close();

	}
}