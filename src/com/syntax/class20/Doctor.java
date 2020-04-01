package com.syntax.class20;

public class Doctor {

	int doctorId;
	String name;

	public Doctor(String name, int doctorId) {
		this.name = name;
		this.doctorId = doctorId;
	}
}

class Dentist extends Doctor {
	int dentNum;

	Dentist(String name, int doctorId, int dentNum) {
		// compiler will try to make call to parent class constructor super();
		super(name, doctorId);
		this.dentNum = dentNum;
	}

	void display() {
		System.out.println(name + " " + doctorId + " " + dentNum);
	}
}
