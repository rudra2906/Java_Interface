package com.system.discountcontract;

public interface IDiscount {
	
	double MAX_TAX_DISCOUNT = 500.0;
	public static final double FLAT_PROMO_OFF = 100.0;
	
	public abstract double calculateDiscount();
	double calcualteDiscountOnTax();

}




















/*
 * java 7 or before
 * Interface is a blueprint of classes tells what need to be implemented, would not tell how 
 * it is like a contract every class which uses that interface must implement the interface methods
 * 
 * in interface they can have attribute but the are by default public static final
 */
