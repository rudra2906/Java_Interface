package com.system.swiggydeepcloning;

public class Swiggy implements Cloneable{

	private String userName;
	private double walletPoint;
	private String userId;
	private OrderDetails orderDetails;
	
	public Swiggy(String userName, double walletPoint, String userId, OrderDetails orderDetails) {
		this.userName = userName;
		this.walletPoint = walletPoint;
		this.userId = userId;
		this.orderDetails = orderDetails;
	}

	public String getUserName() {
		return userName;
	}

	public double getWalletPoint() {
		return walletPoint;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setWalletPoint(double walletPoint) {
		this.walletPoint = walletPoint;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public OrderDetails getOrderDetails() 
	{
		return orderDetails;
	}
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Swiggy swiggyClone = (Swiggy)super.clone();
		swiggyClone.orderDetails = (OrderDetails) orderDetails.clone(); 
		return swiggyClone; 
	}
}

/*
 * cloning is the process of copying exactly same 
 * object cloning can be achieved by creating same object, using clone method
 * and serialization
 * 
 * if im using clone() and serialization i need to take special permission from
 * i need to implement interface Clonable and Serilizable other wise it will give me the
 * exceptions 
 * 
 * there are two way you can clone deep cloning and shallow cloning
 * shallow cloning - when we have the object that contains nested object
 * so after cloning i get the cloned object but nested object will have same refrence copy
 * so, only one level of cloning is happening
 */
