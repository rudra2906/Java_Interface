package com.system.practise;

public interface IBooking {

	static void run() 
	{
		System.out.println("IBooking.run()");
	}
	default void print() 
	{
		System.out.println("Hello");
	}
}
class TicketBooking implements IBooking
{
//	public void print() 
//	{
//		System.out.println("heyy");
//	}
}

