package com.system.quickcommerce;

public class Driver {

	public static void main(String[] args) {
		Billing fee = new Billing();
		System.out.println(
				"Your delivery peak monsoon charges are: " + fee.PeakMonsoonSurcharge.deliveryFees(12, 450, "467889"));
		fee.PeakMonsoonSurcharge.standardDeliveryGuidelines();

		System.out.println("Your standard delivery is: " + fee.standardDaytimeDelivery.deliveryFees(12, 120, "645998"));
		fee.standardDaytimeDelivery.standardDeliveryGuidelines();
	}
}
