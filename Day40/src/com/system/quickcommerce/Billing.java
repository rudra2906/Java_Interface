package com.system.quickcommerce;

public class Billing {

	IDeliveryFeeContract standardDaytimeDelivery = (double orderDistance, double cartValue,String pinCode) -> {
	
		if( pinCode!=null && IDeliveryFeeContract.verifyPincode(pinCode)) 
		{
			double finalAmount = cartValue;

			if (cartValue > 0 && cartValue < 500) {
				finalAmount += 30;
				return finalAmount;
			} else {
				return finalAmount;
			}
		}
		else 
		{
			System.out.println("Your pinCode is not valid");
			return cartValue;
		}
	};

	IDeliveryFeeContract PeakMonsoonSurcharge = (double orderDistance, double cartValue, String pinCode) -> {
		double finalAmount = cartValue + (orderDistance * 12) + 45;

		return finalAmount;
	};
}
