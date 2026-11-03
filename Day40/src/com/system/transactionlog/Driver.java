package com.system.transactionlog;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		BankProcessor process = new BankProcessor();
		process.process(new BankTransaction("RU2934","Rudransh Patel",150000,"8770"));
	}
}
