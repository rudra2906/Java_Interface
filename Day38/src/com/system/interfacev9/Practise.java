package com.system.interfacev9;

interface IBooking
{
	default String status() 
	{
		return "Booking confirmend";
	}
	
	default String toString(String ans) 
	{
		return "";
	}
}
interface ITrainBooking extends IBooking
{
	@Override
	default String status() 
	{
		return "Booking Train confirmed";
	}
}

public class Practise implements ITrainBooking{


	public static void main(String[] args) {
		
		Practise p = new Practise();
		System.out.println(p.status());
		
	}
}
