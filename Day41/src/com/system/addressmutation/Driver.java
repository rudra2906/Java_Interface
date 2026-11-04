package com.system.addressmutation;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		/*
		// shallow cloning
		SwiggyOrder order = new SwiggyOrder("32ADITI", "Ma ki rasoi", new Address("C21", "Vijay Nagar", 462003));
		System.out.println("Order street Name: "+ order.getDeliveryAddress().getStreetName());
		//Order street Name: Vijay Nagar
		SwiggyOrder cloneOrder = (SwiggyOrder) order.clone();
		cloneOrder.getDeliveryAddress().setStreetName("Near Bapat Square");
		
		System.out.println("Original Order: "+ order.getDeliveryAddress().getStreetName());
		//Original Clone Order: Near Bapat Square
		
		*/
		//DeepCloning
		SwiggyOrder dorder = new SwiggyOrder("36", "Papa da Dhaba", new Address("C21", "Pipariya mp ward", 492503));
		System.out.println("original Order street Name: "+ dorder.getDeliveryAddress().getStreetName());
		
		SwiggyOrder dcloneOrder = (SwiggyOrder) dorder.clone();

		System.out.println("dcloneorder address street: "+ dcloneOrder.getDeliveryAddress().getStreetName());

		//modification inside deep clone
		dcloneOrder.getDeliveryAddress().setStreetName("Near Moms magic");
		
		System.out.println("Order street Name after change: "+ dorder.getDeliveryAddress().getStreetName());

		System.out.println("dcloneorder address after change street: "+ dcloneOrder.getDeliveryAddress().getStreetName());

	}

}
