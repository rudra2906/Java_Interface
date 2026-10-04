package com.system.security.employee;

public interface SecurityAccess {
	
	abstract void accessSystem();
	
	default void securityCheck() 
	{
		System.out.println("Security check completed");
	}
}
