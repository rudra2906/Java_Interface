package com.system.transactionlog;

import java.io.*;

public class BankProcessor {

	void process(BankTransaction bank) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream("transaction.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(bank);
		
		System.out.println("Serialization Done");
		
		oos.close();
	}
	
}
