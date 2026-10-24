package com.system.bookmyshow;

public class Driver {

	public static void main(String[] args) {

		BookMyShowFactory booking1 = new BookMyShowFactory();
		Object ob = booking1.getBookingObject("Movie", "Bhaag Milkha Bhaag", "29S", 750);
		MovieTicket t1 = (MovieTicket)ob;
		t1.printMoviePass();
		
		Object ob1 = booking1.getBookingObject("concert", "Nusrat Fathe Ali Khan", "29F", 1200);
		LiveConcertPass t2 = (LiveConcertPass)ob1;
		t2.printConcertWristband();
		

	}

}

/*
 * 
 * upcasting => From parent refrence creating a child object is know as auto up casting
 * in line number Object ob = booking1.getBookingObject("Movie", "Bhaag Milkha Bhaag", "29S", 750); upcasting
 * storing MovieTicket class object to Object class;
 * 
 * downcasting -> from child refrence creating a parent object is know as down casting 
 * it is not done automatically give exception while converting
 * in this line MovieTicket t1 = (MovieTicket)ob; we know that in ob refrence is of MovieTicket so down caste
 * by convertig it to (MoviTicket)ob then calling the method of movieTicke class
 * 
 * first compiler will check on refrence class that method is there or not 
 * then it will call the method at run time of object 
 * 
 * if i create t2 of refrence MovieTicet it will give classCasteException the compiler allows it but the JVM blocks it.
 * because MovieTicket do not know at run time which object will be created and in ob1 it of MovieTicket object
 */
