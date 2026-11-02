package com.system.settlementengine;

public class Driver {

	public static void main(String[] args) {
		
		ExchangeOrder order = new IntradayEquityOrder("23rudy", "JIO", 10, 520);
		ExchangeOrder order1 = new DeliveryEquityOrder("we23", "rudypvtlimited", 25, 640);
		
		
		order.generateContractNote("Rudransh");
		System.out.println(order.calculateBrokerage());
		
		// Test Polymorphic Processor (Upcasting)
		SettelmentProcessor processor = new SettelmentProcessor();
		processor.processOrder(order, "Rudransh");
		processor.processOrder(order1, "Welson");
		
		//3. Test Static Method on Interface
		System.out.println(ISettelment.computeSTT(15));
		
		//4. Test Overridden equals() and .intern()
		System.out.println(order.equals(new IntradayEquityOrder("23rudy", "JIO", 10, 520)));
		
		// 5. Verify SIB and IIB values
		System.out.println("Status: "+order.getStatus() + " Exchange Code: "+ order.getExchangeCode());
		
	}

}
