package com.syntax.class25GroupHW;
//GroupHw2. We have to calculate the average of marks obtained in three subjects by student A and by student B. 
//        Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks. 
//        Provide implementation of abstract method in classes ‘A’ and ‘B’. The constructor of student A takes 
//        the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code

public abstract class Marks {
	int grade1,grade2, grade3;
	
	Marks(int grade1, int grade2, int grade3){
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
	}
	
	abstract double getPercentage();

}
class A extends Marks{
		
	A(int grade1, int grade2, int grade3){
		super(grade1,grade2,grade3);
	}
	@Override
	double getPercentage() {
		double sum,average;
		sum=grade1+grade2+grade3;
		average=sum/3;
		return average;
	}
	
}
class B extends Marks{
	int grade4;
	B(int grade1, int grade2, int grade3, int grade4){
		super(grade1,grade2,grade3);
		this.grade4=grade4;
	}
	@Override
	double getPercentage() {
		double sum,average;
		sum=grade1+grade2+grade3+grade4;
		average=sum/4;
		return average;
	}
}
