package com.system.swiggydeepcloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		OrderDetails orderdetails = new OrderDetails("12", 540, "SWIGGY50");

		Swiggy user = new Swiggy("Rudransh", 50, "rudr355", orderdetails);

		Swiggy userBackup = (Swiggy) user.clone();

		System.out.println(userBackup.getUserName());
		System.out.println(userBackup.getUserId());
		System.out.println(userBackup.getOrderDetails().getOrderAmount());
		user.setUserName("Rudy");
		System.out.println(userBackup.getUserName());
		System.out.println(user.getUserName());
		user.getOrderDetails().setOrderAmount(7878);
		System.out.println();
		System.out.println("User Clone: " + userBackup.getOrderDetails().getOrderAmount());
		System.out.println("User: " + user.getOrderDetails().getOrderAmount());

	}

}
