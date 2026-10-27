/*
 * 
Subclass 2 — ElectronicsCartOrder (Extends CartOrder):

Attributes: extendedWarrantyCharge, transitInsuranceFee

Behavior:

Override computeFinalBill(): Appends both warranty and mandatory transit insurance to the bill.

 */
package com.system.loyaltyEngine;

public class ElectronicsCartOrder extends CartOrder {

	private double extendedWarrantyCharge;
	private double transitInsuranceFee;

	public ElectronicsCartOrder(String orderId, String customerEmail, double rawCartTotal,
			double extendedWarrantyCharge, double transitInsuranceFee) {
		super(orderId, customerEmail, rawCartTotal);
		this.extendedWarrantyCharge = extendedWarrantyCharge;
		this.transitInsuranceFee = transitInsuranceFee;
	}

	public double getExtendedWarrantyCharge() {
		return extendedWarrantyCharge;
	}

	public double getTransitInsuranceFee() {
		return transitInsuranceFee;
	}

	@Override
	public double finalAmount() {
		return super.finalAmount()+this.getExtendedWarrantyCharge()+ this.getTransitInsuranceFee();
	}

	@Override
	public String computeFinalBill() {

		String cartOrderComputeBill = super.computeFinalBill();
		StringBuilder sb = new StringBuilder();
		sb.append(cartOrderComputeBill);
		sb.append("\nExtended Warranty Charge: ").append(this.getExtendedWarrantyCharge());
		sb.append("\nInsurance Fee: ").append(this.getTransitInsuranceFee());
		return sb.toString();

	}

}
