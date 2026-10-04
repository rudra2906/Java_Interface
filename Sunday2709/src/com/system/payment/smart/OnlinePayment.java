package com.system.payment.smart;

public interface OnlinePayment {
	
	//interface variable -- constant
	String PAYMENT_GATEWAY = "RudyPay";
	
	//abstract method-- not defined
	abstract void makePayment(double amount);
	
	default void generateReceipt() {
		System.out.println("This is generate receipt");
	};  
	
	static void paymentPolicy() 
	{
		System.out.println("RudyPay's payment policy are: you can directly pay to upi, number and so on");
		System.out.println("There will not be hidden charges");
	}
	
}

















//Q1. Smart Payment System 💳
//
//Create a Java program for a payment system.
//
//You have two interfaces:
//
//OnlinePayment
//
//Interface variable: PAYMENT_GATEWAY = "RudyPay" (constant)
//Abstract method: makePayment(double amount)
//Default method: generateReceipt() → prints a generic receipt message
//Static method: paymentPolicy() → prints the payment policy
//
//RewardSystem
//
//Abstract method: calculateReward(double amount)
//Default method: showRewardMessage() → prints a reward message
//
//Create a class CreditCardPayment that implements both interfaces.
//
//Requirements:
//
//Implement both abstract methods.
//Override generateReceipt().
//Use the interface variable inside the class.
//Call the static method correctly.
//Create an object and demonstrate all methods.
//
//Challenge: In generateReceipt(), print the payment gateway and amount.