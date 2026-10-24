package com.system.amazonorderdiscount;

public class AmazonOrderProcessor {

	public void executeCheckout( CustomerOrder order ) 
	{
		order.processOrderDiscount();
	}
	
}
