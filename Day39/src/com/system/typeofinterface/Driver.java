package com.system.typeofinterface;

public class Driver {//implements IOrder{

	
	public static void main(String[] args) {
		
//		Driver d = new Driver();
//		d.printReceipt();

		IOrder order = (orderId, name) ->{
			System.out.println("lambda expresion");
			return orderId;
		};
	
		String orderId= order.printReceipt("rudransh2323","Rudransh Patel");
		System.out.println(orderId  );
	}
//
//	@Override
//	public void printReceipt() {
//		// TODO Auto-generated method stub
//		
//	}

}
