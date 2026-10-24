/*
 * Child Class 3 — Newly Onboarded Later (StudentPrimeOrder extends CustomerOrder):

Attributes: universityId, flatStudentDiscount


Behavior: Override processOrderDiscount to deduct flatStudentDiscount from orderAmount 
and return the final amount.
 */
package com.system.amazonorderdiscount;

public class StudentPrimeOrder extends CustomerOrder {

	private String universityId;
	private double flatStudentDiscount;

	public StudentPrimeOrder(String orderId, String customerName, double orderAmount, String universityId,
			double flatStudentDiscount) {
		super(orderId, customerName, orderAmount);
		this.universityId = universityId;
		this.flatStudentDiscount = super.checkNegative(flatStudentDiscount);

	}

	public String getUniversityId() {
		return this.universityId;
	}

	public double getFlatStudentDiscount() {
		return this.flatStudentDiscount;
	}

	@Override
	public double processOrderDiscount() {
		double finalAmount = super.processOrderDiscount();
		System.out.println("University Id: " + this.getUniversityId());
		finalAmount -= this.flatStudentDiscount;
		System.out.println("Final Amount: " + finalAmount);
		return finalAmount;
	}

}
