package com.system.zomato;

public class OrderBackup {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Kolar road block", "Sector C", "Bhopal");

		Order order = new Order("Rudransh patel", "we23", 100, address);

		System.out.println(order.getName());

		Order cloneOrder = (Order) order.clone();

		System.out.println(cloneOrder.getAddress().getCity());

		order.address.setCity("Indore");
		
		System.out.println(order.address.getCity());
		System.out.println(cloneOrder.address.getCity());
		
		order.setName("Ansh");
		System.out.println(order.getName());
		System.out.println(cloneOrder.getName());
	}

}
