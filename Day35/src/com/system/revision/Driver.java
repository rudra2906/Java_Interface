package com.system.revision;

class Order{
	public void displayDetails() 
	{
		System.out.println("Order.displayDetails()");
	}
}
class ExpressBee extends Order{
	@Override
	public void displayDetails() 
	{
		System.out.println("ExpressBee.displayDetails()");
	}
}
class EkartLogistic extends Order{
	@Override
	public void displayDetails() 
	{
		System.out.println("EkartLogistic.displayDetails()");
	}
}
public class Driver {

	public static void main(String[] args) {
		Order order = new Order();
		order.displayDetails();
		
		Order order1 = new EkartLogistic();
		order1.displayDetails();
		
		//ExpressBee eb1 = (ExpressBee) new Order(); //class caste exception
		
		Order order2 = new EkartLogistic();
		EkartLogistic e1 = (EkartLogistic)order2;
		e1.displayDetails();
		
	}
	
}
