package com.system.revision;

class Order
{
	public static void print() 
	{
		System.out.println("PractiseMethodHiding.print()");
	}
}
class CartOrder extends Order
{
	public static void print() 
	{
		System.out.println("CartOrder.print()");
	}
}

public class PractiseMethodHiding {

public static void main(String[] args) {
	Order order = new CartOrder();
	order.print();
	
	CartOrder order1 = new CartOrder();
	order1.print();
}
	
}
