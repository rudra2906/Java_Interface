package com.system.polymorphism;

public class DistrictByZomatoFactory {

	public void call( District work ) 
	{
		System.out.println("DistrictByZomatoFactory.call()");
		work.displayDetails();
	}
	
}
