package com.system.flipkartreturn;

/*
 * Level 1 Base Class (ReturnRequest):

Static Attributes: maxReturnWindowDays, platformRestockingFeeRate

Instance Attributes: returnId, orderAmount, requestStatus, pickupPartner

Behavior:

Use a Static Initialization Block to load maxReturnWindowDays (e.g., 7 days) and 
platformRestockingFeeRate (e.g., 2%) and print a system boot message.

Use an Instance Initialization Block to automatically set requestStatus to "INITIATED" and 
print an audit log before the constructor runs.

Provide two overloaded constructors: one that accepts returnId and orderAmount 
(and chains via this(...) to set default pickupPartner as "Ekart Logistics"), and a second 
that accepts all three parameters.

calculateRefundAmount: Returns orderAmount.
 */
public class ReturnRequest {

	private static int maxReturnWindowDays;
	private static int platformRestockingFeeRate;

	private String returnId;
	private double orderAmount;
	private String requestStatus;
	private String pickupPartner;

	public ReturnRequest(String returnId, double orderAmount, String pickupPartner) {
		this.returnId = returnId;
		this.orderAmount = checkNegative(orderAmount);
		this.pickupPartner = pickupPartner;
	}
	private double checkNegative(double value) 
	{
		if(value>=0) 
		{
			return value;
		}
		else 
		{
			return 0.0;
		}
	}

	public ReturnRequest(String returnId, double orderAmount) 
	{
		this(returnId, orderAmount,"Ekart Logistics");
	}

	public String getReturnId() {
		return this.returnId;
	}

	public double getOrderAmount() {
		return this.orderAmount;
	}

	public String getRequestStatus() 
	{
		return this.requestStatus;
	}

	public String getPickupPartner() {
		return this.pickupPartner;
	}

	static {
		System.out.println("System Started.......");
		ReturnRequest.maxReturnWindowDays = 7;
		System.out.println("Max Return window Days: "+ReturnRequest.maxReturnWindowDays);
		ReturnRequest.platformRestockingFeeRate = 2;
		System.out.println("Platform Restocking Fee Rate "+ReturnRequest.platformRestockingFeeRate);

	}
	{
		this.requestStatus = "INITIATED";
		System.out.println(
				"[AUDIT LOG] New Flipkart Return Request object created. Status set to: " + this.requestStatus);
	}

	public double calculateRefundAmount() {
		return this.getOrderAmount();
	}
}