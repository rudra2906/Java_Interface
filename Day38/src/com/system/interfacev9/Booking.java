package com.system.interfacev9;

interface IBookingTicket
{
	default void ticket() 
	{
		System.out.println("IBooking.ticket()");
	}
}
class TrainBooking implements IBookingTicket
{
	@Override
	public void ticket() 
	{
		System.out.println("TrainBooking.ticket()");
	}
}
final class FinalTrainBooking
{
	
}
public class Booking {

	public static void main(String[] args) {
		IBookingTicket booking = new TrainBooking();
		booking.ticket();
	}
	
}





/*
 * interface IBooking {
    default String bookTicket(Object passengerId) {
        return "Interface: " + passengerId;
    }
}
class TrainBooking implements IBooking {
    public String bookTicket(String passengerId) {
        return "Train: " + passengerId;
    }
}
public class Main {
    public static void main(String[] args) {
        IBooking ref = new TrainBooking();
        System.out.println(ref.bookTicket("IRCTC-99"));
    }
}
 * 
 */
