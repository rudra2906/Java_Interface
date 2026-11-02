package com.system.revision;

public class PractiseOverloading {
	void add(int a , long b) 
	{
		System.out.println("int long");
	}
	void add(long a, int b) 
	{
		System.out.println("long int");
	}
	public static void main(String[] args) {
		
		PractiseOverloading p = new PractiseOverloading();
		//p.add(10, 20);
	}
}
