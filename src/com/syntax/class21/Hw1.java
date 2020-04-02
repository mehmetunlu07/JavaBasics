package com.syntax.class21;
//Create 1 class in which create a methods that will calculate the area (volume) of 
//Rectangle, Square, Box
//Use separate class to test your code

public class Hw1 {
	int length;
	int width;
	int height;
	
	Hw1(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
  int areaRectangle() {
	  int areaRectangle=length*width;
	  return areaRectangle;
  }
  
  int areaSquare() {
	  int areaSquare=width*width;
	  return areaSquare;
  }
  
  int areaBox() {
	  int areaBox=length*width*height;
	  return areaBox;
	  
  }
}
