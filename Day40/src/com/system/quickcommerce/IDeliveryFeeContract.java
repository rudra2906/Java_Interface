package com.system.quickcommerce;

@FunctionalInterface
public interface IDeliveryFeeContract {

	double deliveryFees( double orderDistance, double cartValue , String pin); 
	
	public static boolean verifyPincode(String value)
	{
		if(value.length()==6) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	default void standardDeliveryGuidelines() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Delivery gudie Lines");
		sb.append("\nthere is flat 30inr rupees fee when cart value is less than 500");
	}
	
}
