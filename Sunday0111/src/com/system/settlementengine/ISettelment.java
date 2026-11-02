/*
 * 1 abstract method to calculate brokerage, 1 default method to generate a 
 * contract note (which calls a Java 9 private interface helper to attach a 
 * digital signature), and 1 static method to compute STT (Securities 
 * Transaction Tax).
 */

package com.system.settlementengine;

public interface ISettelment {

	double calculateBrokerage();
	
	private boolean digitalSignature(String userName) 
	{
		System.out.println("Digital Signature: " + userName);
		return true;
	}
	default void generateContractNote(String userName) 
	{
		digitalSignature(userName);
	} 
	
	public static double computeSTT(double turnOver) 
	{
		return turnOver * 0.001;
	}
	
}
