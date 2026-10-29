package com.system.mmt;

public interface IBooking {

	void validateUser();

	void booking();

	void bookingStatus();

	void generateTicket();
	
	public default void autoUpgradation() 
	{
		System.out.println("IBooking.autoUpgradation()");
	}

}
