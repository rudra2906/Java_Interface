/*
 * 
Write a settlement processor method that accepts the Interface or Abstract Parent reference 
(Upcasting) and processes both Intraday and Delivery orders polymorphically without if-else chains.

 */
package com.system.settlementengine;

public class SettelmentProcessor {
	
	public void processOrder( ISettelment order, String investorName ) 
	{
		order.generateContractNote(investorName);
		
		double brokarage = order.calculateBrokerage();
		
		System.out.println(brokarage);
	}

}
