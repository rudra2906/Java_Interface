package com.system.security.employee;

public interface Employee {
	
	final String COMPANY_NAME = "TechNova";
	
	abstract void work();
	
	default void attendance() 
	{
		System.out.println("Attendance Marked");
	}
	
	static void companyPolicy() 
	{
		System.out.println(Employee.COMPANY_NAME + " Company policy");
		System.out.println("If verification fails then need to relogin");
		System.out.println(" There is no sandwich policy. ");
		System.out.println("Salary will be credited to your account on 1 of every month");
	}
}
