/*
 * Testing SwiggyOrder,InstamartGroceryOrder, SwiggyGenieOrder,SwiggyCheckoutProcessor with some test cases 
 * 
 */
package com.system.zomatocheckout;

public class Driver 
{
	public static void main(String[] args) {
		SwiggyCheckoutProcessor order = new SwiggyCheckoutProcessor();
		//SwiggyOrder
//		SwiggyOrder order1 = new SwiggyOrder("QW12", "Rudransh Patel", 780);	
//		order.processCheckout(order1);
//		System.out.println();
//		order.processCheckout(order1, "Swiggy10");
//		System.out.println();
//		order.processCheckout(order1, "Swiggy100", false);
//		
//		System.out.println();
//		order.processCheckout(order1, "Swiggy100", true);
//
//		System.out.println("ORDER 2");		
//		SwiggyOrder order2 = new InstamartGroceryOrder("RU9382", "Ishit Verma", 1020, 60, 199);
//		order.processCheckout(order2);
//		System.out.println("order 2 cuponcode");
//		order.processCheckout(order2, "Swiggy100");
		
		System.out.println("swiggy order3");
		SwiggyOrder order3 = new SwiggyGenieOrder("YU903", "Vidit", 600, 9, 5);
		order.processCheckout(order3, null, true);
		
	}	
}