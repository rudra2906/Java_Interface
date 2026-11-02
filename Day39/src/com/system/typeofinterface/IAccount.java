package com.system.typeofinterface;

public interface IAccount{
	
	void print();

	default void openAccount() 
	{
		System.out.println("IAccount.openAccount()");
	}
	
}
