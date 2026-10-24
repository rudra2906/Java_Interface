package com.system.polymorphism;

public class Driver {

	public static void main(String[] args) {
		
		DistrictByZomatoFactory district = new DistrictByZomatoFactory();
		
		
		//District user = new LiveConcert();
		district.call(new LiveConcert());
		
		district.call(new MovieTicket());
		
		district.call(new Dineout());
		
		
	}

}
