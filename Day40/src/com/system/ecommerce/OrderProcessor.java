package com.system.ecommerce;

import java.io.*;

public class OrderProcessor {

	void process(CustomerOrder order) throws IOException {
		FileOutputStream fos = new FileOutputStream("customerOrder.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(order);
		oos.close();
		System.out.println("Serilization done");
	}

}
