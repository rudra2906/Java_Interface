package com.system.ecommerce;

import java.io.*;

public class DeSeDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:\\Java\\Day40\\customerOrder.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// downcaste
		CustomerOrder order = (CustomerOrder) ois.readObject();
		System.out.println(order.printCustomerOrder());
		ois.close();
	}
}
/*
 * if customerOrder class is updated and version UID is changed then if ill do deserilization of the previous serilized file then it will throw exception
 * InvalidClassException means that UID should be same at the time at deserilization process and after fixing the UID can convert byte stream into the 
 * copy of that object
 */