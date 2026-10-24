/*
 * Create an instance of AmazonOrderProcessor.

Pass RegularCustomerOrder and PrimeCustomerOrder objects to executeCheckout.

Onboard StudentPrimeOrder and pass it to the exact same executeCheckout method without changing a single line inside AmazonOrderProcessor
 */
package com.system.amazonorderdiscount;

public class Driver {

	public static void main(String[] args) {
		
		AmazonOrderProcessor amazon = new AmazonOrderProcessor();
		
		amazon.executeCheckout(new RegularCustomerOrder("SU#@", "Suraj", 2000, 100));
		
		amazon.executeCheckout(new PrimeCustomerOrder("Ru", "rohit", 400, 50));
		
		amazon.executeCheckout(new CustomerOrder("Customer", "Rajeev", 5000));
		
		amazon.executeCheckout(new StudentPrimeOrder("Student", "Ishit", 780, "S32", 90));
		
	}

}
