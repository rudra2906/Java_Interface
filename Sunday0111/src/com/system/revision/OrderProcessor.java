package com.system.revision;

class ZomatoOrder
{
	void process(long orderId) 
	{
		System.out.println("Order Id long ");
	}
	void process(Integer orderId) 
	{
		System.out.println("Order id integer");
	}
}
public class OrderProcessor {
	public static void main(String[] args) {
		ZomatoOrder order = new ZomatoOrder();
		order.process(100);
	}
}
