/*
 * Behavior (Compile-Time Overloading + Runtime Dispatch):

Overload 1: processCheckout(CartOrder order) — Accepts any order via upcasting, executes computeFinalBill() dynamically, and
 prints the generated invoice using StringBuilder.

Overload 2: processCheckout(CartOrder order, String couponCode) — Validates couponCode. If matches "FLIPKART50", applies a 
flat discount before calculating final payable amount.

Overload 3: processCheckout(CartOrder order, String couponCode, boolean useSuperCoins, int superCoinBalance) — 
Combines the coupon check with SuperCoin redemption (e.g., each coin = ₹1 discount, up to a maximum cap of 20% of order value).

 */
package com.system.loyaltyEngine;

public class Processor {

	public void processCheckout(CartOrder order) {
		System.out.println(order.computeFinalBill());
		System.out.print("Final Bill: ");
		System.out.println(order.finalAmount());
	}
	
	public void processCheckout(CartOrder order, String couponCode) {
		if ("FLIPKART50".equalsIgnoreCase(couponCode)) {
			System.out.println(order.computeFinalBill());
			System.out.println("Coupon Code Applied!! ");
			System.out.print("Final Bill After Coupon Code: ");
			System.out.println(order.finalAmount() - 50);

		} else {
			System.out.println(order.computeFinalBill());
			System.out.println("OOPs Coupon Code is not available.");
			System.out.print("Final Bill: ");
			System.out.println(order.finalAmount());
		}
	}

	public void processCheckout(CartOrder order, String couponCode, boolean useSuperCoins, int superCoinBalance) {
		// case 1 - coupon code and supercoin first check the super coin

		if ("FLIPKART50".equalsIgnoreCase(couponCode) && useSuperCoins) {
			// Combines the coupon check with SuperCoin redemption (e.g., each coin = ₹1
			// discount, up to a maximum cap of 20% of order value).
			System.out.println(order.computeFinalBill());
			System.out.print("Super Coin Applied: ");
			if (superCoinBalance > 0) {
				if (superCoinBalance <= order.finalAmount() * 0.20) {
					System.out.println(superCoinBalance);
					System.out.println("Coupon Code Applied!! ");
					System.out.print("Final Bill: ");
					System.out.println(order.finalAmount() - 50 - superCoinBalance);
				} else if (superCoinBalance > order.finalAmount() * 0.20) {

					System.out.println(order.finalAmount() * 0.20);
					System.out.println("Coupon Code Applied!! ");
					System.out.print("Final Bill: ");
					System.out.println(order.finalAmount() - 50 - order.finalAmount() * 0.20);

				}
			} else {
				System.out.println("You do not have enough super coin balance");
				System.out.println("Coupon Code Applied!! ");
				System.out.print("Final Bill: ");
				System.out.println(order.finalAmount() - 50);
			}

		}
		// case 2 - no coupon code , use super coin
		else if (!("FLIPKART50".equalsIgnoreCase(couponCode)) && useSuperCoins) {
			// Combines the coupon check with SuperCoin redemption (e.g., each coin = ₹1
			// discount, up to a maximum cap of 20% of order value).
			System.out.println(order.computeFinalBill());
			System.out.print("Super Coin Applied: ");
			if (superCoinBalance > 0) {
				if (superCoinBalance <= order.finalAmount() * 0.20) {
					System.out.println(superCoinBalance);
					System.out.print("Final Bill: ");
					System.out.println(order.finalAmount() - superCoinBalance);
				} else if (superCoinBalance > order.finalAmount() * 0.20) {

					System.out.println(order.finalAmount() * 0.20);
					System.out.print("Final Bill: ");
					System.out.println(order.finalAmount() - order.finalAmount() * 0.20);

				}
			} else {
				System.out.println("You do not have enough super coin balance");
				System.out.print("Final Bill: ");
				System.out.println(order.finalAmount());
			}

		}
		// case 3 - only coupon code, no super coin
		else if ("FLIPKART50".equalsIgnoreCase(couponCode) && !useSuperCoins) {
			processCheckout(order, couponCode);
		}
		else 
		{
			System.out.println(order.computeFinalBill());
			System.out.println("OOPs Coupon Code is not available.");
			System.out.print("Final Bill: ");
			System.out.println(order.finalAmount());
		}
	}

}
