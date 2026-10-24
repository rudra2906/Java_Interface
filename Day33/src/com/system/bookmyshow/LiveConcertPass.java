package com.system.bookmyshow;

public class LiveConcertPass {

	private String artistName;
	private String arenaZone;
	private double passFee;

	public LiveConcertPass(String artistName, String arenaZone, double passFee) {
		this.artistName = artistName;
		this.arenaZone = arenaZone;
		this.passFee = checkNegative(passFee);
	}

	private double checkNegative(double value) {
		if (value >= 0) {
			return value;
		} else {
			System.out.println("[Error] check the value");
			return 0.0;
		}
	}

	public String getArtistName() {
		return this.artistName;
	}

	public String getArenaZone() {
		return this.arenaZone;
	}

	public double getPassFee() {
		return this.passFee;
	}

	public void printConcertWristband() {
		System.out.println("welcome's you in our show by: " + this.getArtistName());
		System.out.println("Arena Zone: " + this.getArenaZone());
		System.out.println("PassFees: " + this.getPassFee());
	}
}
