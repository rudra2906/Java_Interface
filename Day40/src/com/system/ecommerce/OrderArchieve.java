package com.system.ecommerce;

import java.io.IOException;

public class OrderArchieve {

	public static void main(String[] args) throws IOException {
		OrderProcessor order = new OrderProcessor();
		order.process(new CustomerOrder("32995", "ansh@9948gmail.com", 4800));
		
	}
}
