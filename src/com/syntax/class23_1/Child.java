package com.syntax.class23_1;

class Child extends Parent {
	@Override
	public void method() {
		System.out.println("I am a child public method");
	}

	@Override
	protected void method(int a) {
		System.out.println("I am a child protected method");
	}

	@Override
	void method(int a, int b) {
		System.out.println("I am a child default method");
	}
//	  @Override
//	  private void method(String a){
//	     System.out.println("I am a child private method");
//	  }
}