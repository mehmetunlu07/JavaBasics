package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		Food [] foodArray= {new Soup(), new Steak(), new Salad(), new Dessert()};  // array of objects
		
		ArrayList<Food> food=new ArrayList<>();
		food.add(new Soup());
		food.add(new Steak());
		food.add(new Salad());
		food.add(new Dessert());
		
		for(int i=0;i<food.size();i++) {
			Food obj=food.get(i);
			obj.make();
			obj.serve();
			obj.pay();
		}
		System.out.println("----------For each loop--------------");
		for(Food f:food) {
			f.make();
			f.serve();
			f.pay();
		}
		System.out.println("----------Iterator--------------");
		Iterator<Food> f=food.iterator();
		while(f.hasNext()) {
			Food obj=f.next();
			obj.make();
			obj.serve();
			obj.pay();
		}
	}

}
