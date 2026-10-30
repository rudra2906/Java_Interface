package com.system.travelticketprinter;

public class TrainBooking implements IBooking {

	private String name;
	private String source;
	private String destination;
	private double distanceKm;

	public TrainBooking(String name, String source, String destination, double distanceKm) {
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.distanceKm = checkNegative(distanceKm);

	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("Your value is negative setting it to zero");
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public double getDistanceKm() {
		return distanceKm;
	}

	@Override
	public void bookTicket() {

		double fare = (this.getDistanceKm() * 40);
		System.out.println(IBooking.printTicket(this.getName(), this.getSource(), this.getDestination(), fare));

	}

}
