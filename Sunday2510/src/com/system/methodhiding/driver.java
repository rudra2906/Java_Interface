package com.system.methodhiding;

public class driver {

	public static void main(String[] args) {
		
		BankServer bank = new HdfcServer();
		bank.ping(); //bank method called because method hidden
		BankServer.ping();
		HdfcServer.ping();
		
		

	}

}
