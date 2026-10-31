package com.system.bankingdatabase;

public class Driver {

	public static void main(String[] args) {
		SbiAccount user = new SbiAccount("Rudransh",15000.0,"8770400437848");
		user.basicAccountInquiry();
		user.transferFund(500);
		user.basicAccountInquiry();
	}
	
}
