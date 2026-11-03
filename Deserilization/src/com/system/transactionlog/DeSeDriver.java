package com.system.transactionlog;

import java.io.*;

public class DeSeDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream fis = new FileInputStream("D:\\Java\\Day40\\transaction.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		BankTransaction user = (BankTransaction) ois.readObject();
		
		System.out.println(user.printDetails());
		
		ois.close();
	}
}
