package com.system.bookmyshow;

public class MovieTicket {

	private String movieTitle;
	private String seatNumber;
	private double ticketPrice;

	MovieTicket(String movieTitle, String seatNumber, double ticketPrice) {
		this.movieTitle = movieTitle;
		this.seatNumber = seatNumber;
		this.ticketPrice = checkNegative(ticketPrice);
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("Enter the correct amount.");
			return 0.0;
		}
	}

	public String getMovieTitle() {
		return this.movieTitle;
	}

	public String getSeatNumber() {
		return this.seatNumber;
	}

	public double getTicketPrice() {
		return this.ticketPrice;
	}

	public void printMoviePass() {
		System.out.println("Movie Title: " + this.getMovieTitle());
		System.out.println("Seat Number: " + this.getSeatNumber());
		System.out.println("Ticket Price: " + this.getTicketPrice());
	}

}
