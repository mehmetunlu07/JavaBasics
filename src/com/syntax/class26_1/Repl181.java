package com.syntax.class26_1;

import java.util.ArrayList;

public class Repl181 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("yo");
		list.add("sup");
		list.add("yolo");
		list.add("boop");
		for (int i = 0; i < list.size(); i++) {  //i nci elemani silince indexi ona gore degistiriyor!
			list.remove(i);
		}
		System.out.println(list);

	}

}