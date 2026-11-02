package com.system.practisesam;

public class SavingsAccount {

	IAccount acc = (customerName, branch, initalDeposit) -> {
		StringBuilder sb = new StringBuilder();
		sb.append("Customer Name: ").append(customerName).append("Branch: ").append(branch).append("Initial Deposit: ").append(initalDeposit);
		return sb.toString();
	};

	public static void main(String[] args) {
	
		SavingsAccount sv = new SavingsAccount();
		System.out.println(sv.acc.openAccount( "Rudransh", "Pipariya", 100 ));
		
	}
	
}
