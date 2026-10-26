/*
 * Behavior (Combine Method Overloading + Runtime Polymorphism):

processCheckout(SwiggyOrder order): Accepts any SwiggyOrder child via upcasting and prints the final bill.

processCheckout(SwiggyOrder order, String couponCode): Overloaded version that deducts ₹100 
if couponCode matches "SWIGGY100" and then computes the bill.

processCheckout(SwiggyOrder order, String couponCode, boolean useSwiggyMoney): Overloaded version that applies both the coupon and a 
5% wallet cashback
 */
package com.system.zomatocheckout;

public class SwiggyCheckoutProcessor {

	public void processCheckout(SwiggyOrder order) {
		System.out.println("Your final Payable amount is: " + order.calculateFinalBill());
	}

	public void processCheckout(SwiggyOrder order, String couponCode) {
		double finalAmount = order.calculateFinalBill();
		if ("SWIGGY100".equalsIgnoreCase(couponCode)) {
			double couponCodeAmount = 100.0;
			if (order.getCartValue() > couponCodeAmount) {
				System.out.println("Coupon Code Applied!! of Rupees :" + 100);
				System.out.println("Final bill : " + (finalAmount - couponCodeAmount));
			} else {
				System.out.println("Sorry... You are not eligible for CouponCode.");
				System.out.println("Your Final Payable amount is: " + finalAmount);
			}
		} else {
			System.out.println("Sorry... Wrong CouponCode.");
			System.out.println("Your Final Payable amount is: " + finalAmount);
		}
	}

	public void processCheckout(SwiggyOrder order, String couponCode, boolean useSwiggyMoney) {
		
		// coupon code and swiggy money both applied
		if ("SWIGGY100".equalsIgnoreCase(couponCode) && useSwiggyMoney) {
			double finalAmount = order.calculateFinalBill();
			double cashBack = order.getCartValue() * 0.05;
			double deductionAmount = 100.0 + cashBack;
			double couponCodeAmount = 100.0;
			if (order.getCartValue() > deductionAmount) {
				System.out.println("Coupon Code Applied!! of Rupees :" + couponCodeAmount);
				System.out.println("Swiggy Money: " + cashBack);
				System.out.println("Final payable amount is: " + (finalAmount - deductionAmount));
			} else {
				System.out.println("Sorry... You are not eligible for CouponCode and Swiggy Money.");
				System.out.println("Your final Payable amount is: " + finalAmount);
			}
			// coupon code and no swiggy money
		} else if ("SWIGGY100".equalsIgnoreCase(couponCode) && !useSwiggyMoney) {
			processCheckout(order, couponCode);
		}
		// no coupon code and swiggy money
		else if (!("SWIGGY100".equalsIgnoreCase(couponCode)) && useSwiggyMoney) {
			double finalAmount = order.calculateFinalBill();
			double cashBack = order.getCartValue() * 0.05;

			if (order.getCartValue() > cashBack) {
				System.out.println("CashBack Applied!! of Rupees :" + cashBack);
				System.out.println("Final payable amount is: " + (finalAmount - cashBack));
			} else {
				System.out.println("Sorry... You are not eligible for CouponCode and Swiggy Money.");
				System.out.println("Your final Payable amount is: " + finalAmount);
			}
		}
		// both false case
		else {
			double finalAmount = order.calculateFinalBill();
			System.out.println("Sorry... You are not eligible for CouponCode and Swiggy Money.");
			System.out.println("Your final Payable amount is: " + finalAmount);
		}
	}

}
