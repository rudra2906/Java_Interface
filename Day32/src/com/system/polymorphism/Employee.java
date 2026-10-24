package com.system.polymorphism;

public class Employee {

	public void markIn() {
		System.out.println("Employee.markIn()");
	}
	
	
}

class TeamLead extends Employee
{
	public void markIn() 
	{
		System.out.println("TeamLead.markIn()");
	}
}