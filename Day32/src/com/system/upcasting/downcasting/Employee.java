package com.system.upcasting.downcasting;

public class Employee {
	Employee()
	{
		System.out.println("Employee.Employee()");
	}
}
class Manager extends Employee
{
	Manager(){
		System.out.println("Manager.Manager()");
	}
	int a = 10;
}


