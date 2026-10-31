package com.system.multiple;

interface IOrder
{
	default void print() 
	{
		System.out.println("IOrder.print()");
	}
}
interface ICheckOut
{
	static void runnin() 
	{
		System.out.println("static");
	}
	default void print() 
	{
		System.out.println("ICheckOut.print()");
	}
}

public class Order implements IOrder, ICheckOut{

	@Override
	public void print() 
	{
//		System.out.println("Order(IOrder,ICheckOut)");
//		System.out.println();
		ICheckOut.super.print();
		IOrder.super.print();
	}
	
	public static void main(String[] args) {
//		Order order = new Order();
//		order.print();
		
		ICheckOut checkout = new Order();
		checkout.print();
		
		//checkout.runnin();
	}
	
}
