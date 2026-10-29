/*
 * Evaluation Criteria:

Implementing all 3 inherited contracts in VandeBharatBooking (4 marks)

Encapsulation, private maskGovId using StringBuilder, and equals(Object obj) downcasting (4 marks)

Driver testing overloaded methods via interface references and duplicate PNR check (3 marks)
 */

package com.system.taxengine;

public class Driver {

	public static void main(String[] args) {
		VandeBharatBooking booking = new VandeBharatBooking(new String("8770400437"), "Rudransh", "702035987757", 200, "1AC", 80);
		System.out.println(booking.generateTicketSummary());	;
		VandeBharatBooking booking1 = new VandeBharatBooking("8770400437", "Rudransh", "702045987757", 200, "1AC", 80);
		System.out.println(booking1.equals(booking));
	
	}
}
