package com.system.practiseString;

public class Client {

	public static void main(String[] args) {

		CreditCardAccount c1 = new CreditCardAccount("Rudransh Patel", "8770400437456568", "RUPAY", 70000);
		System.out.println(c1.generateMonthlyStatement());
		System.out.println(c1.getCardHolderName());
		System.out.println(c1.getTotalSpent());

		String s = "RUPAY";
		System.out.println(c1.getCardNetwork() ==  s);//true
		System.out.println(c1.getCardNetwork().equals(s));

		MillenniaCashbackCard m = new MillenniaCashbackCard("yash", "8716841384318345", "RUPAY", 39999, 3, 40000 );
		System.out.println(m.generateMonthlyStatement());
		
		System.out.println(c1.getCardNetwork() == m.getCardNetwork());
	}

}

