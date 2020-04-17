package com.syntax.class27;
//2. hw create food class that will have 3 undefined methods and it will have 4 subclasses; create a collection of food and using 3 ways execute methods

public abstract class Food {
	abstract void make();
	abstract void serve();
	abstract void pay();
}
class Soup extends Food{

	@Override
	void make() {
		System.out.println("Soup is made");
		
	}

	@Override
	void serve() {
		System.out.println("Soup is served");
		
	}

	@Override
	void pay() {
		System.out.println("Soup is paid");
		
	}
	
}
class Steak extends Food{

	@Override
	void make() {
		System.out.println("Steak is made");
		
	}

	@Override
	void serve() {
		System.out.println("Steak is served");
		
	}

	@Override
	void pay() {
		System.out.println("Steak is paid");
		
	}
	
}
class Salad extends Food{

	@Override
	void make() {
		System.out.println("Salad is made");
		
	}

	@Override
	void serve() {
		System.out.println("Salad is served");
		
	}

	@Override
	void pay() {
		System.out.println("Salad is paid");
		
	}
	
}
class Dessert extends Food{

	@Override
	void make() {
		System.out.println("Dessert is made");
		
	}

	@Override
	void serve() {
		System.out.println("Dessert is served");
		
	}

	@Override
	void pay() {
		System.out.println("Dessert is paid");
		
	}
	
}
