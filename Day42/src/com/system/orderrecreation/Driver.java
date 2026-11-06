package com.system.orderrecreation;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		DeliverySlot deliverySlot = new DeliverySlot("5th November", "11 AM - 12 PM");
		OrderBasket basket = new OrderBasket("Rudy32", 54876, deliverySlot);

		OrderBasket backupBasket = (OrderBasket) basket.clone();

		System.out.println("Original Basket time slot: " + basket.getDeliverySlot().getTimeSlot());
		System.out.println("Cloned basket time slot: " + backupBasket.getDeliverySlot().getTimeSlot());

		System.out.println("\n**************changing cloned***********\n");
		backupBasket.getDeliverySlot().setTimeSlot("12 Pm - 1PM ");

		System.out.println("Original Basket after change time slot: " + basket.getDeliverySlot().getTimeSlot());
		System.out.println("Cloned basket after change time slot: " + backupBasket.getDeliverySlot().getTimeSlot());

	}

}
/*
 * if permission clone is missing then we will get exception
 * clonenotsupportedexception as clonning is crucial activity it requires
 * special permission which was given by marker interface by implementing
 * cloneable
 */
