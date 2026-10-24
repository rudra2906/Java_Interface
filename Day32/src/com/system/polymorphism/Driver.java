package com.system.polymorphism;

public class Driver {

	public static void main(String[] args) {
		
//		Employee e1 = new Employee();
//		e1.markIn();
		
		Employee e2 = new TeamLead();
		e2.markIn();

		// parent class can refer to the child class 
		//first parent class will check at compile time method exits in class
		//
	}

}
