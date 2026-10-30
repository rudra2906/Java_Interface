package com.system.interfacev8;

interface IBookings
{
	public default void display() 
	{
		System.out.println("Hello");
	}
}
interface IStrictTrainBooking extends IBookings
{
	@Override
	public abstract void display();
} 

interface ITrainBooking
{
	public abstract void display();
}


public class PractiseQuestion implements IBookings , ITrainBooking{
	public static void main(String[] args) {
	
		
		
	}

	@Override
	public void display() {
		
		
	}
}

