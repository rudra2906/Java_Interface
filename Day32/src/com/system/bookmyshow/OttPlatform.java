/*
 * Parent Class (OttPlatform):

Attributes: platformName, subscriptionPrice 
(Choose data types & encapsulate).

Static Method (To test Method Hiding):

checkServerStatus: A public static method that prints 
"Parent OTT Server is Online".

Instance Methods (Overloaded in Parent):

streamContent(movieTitle): Streams in default SD quality (480p).

streamContent(movieTitle, resolution): Streams in specified resolution 
(e.g., "1080p" or "4K").
 */

package com.system.bookmyshow;

public class OttPlatform {

	private String plaformName;
	private double subscriptionPrice;

	public OttPlatform(String platformName, double subscriptionPrice) {
		this.plaformName = platformName;
		this.subscriptionPrice = subscriptionPrice;

	}

	public String getPlatformName() {
		return this.plaformName;
	}

	public double getSubscriptionPrice() {
		return this.subscriptionPrice;
	}

	public static void checkServerStatus() {
		System.out.println("Parent OTT Server is Online");
	}

	public void display() {
		System.out.println("OTT.display()");
	}
	
	// method overloading -- complie time polymorphism
	String streamContent(String movieTitle) {
		StringBuilder content = new StringBuilder(movieTitle);
		content.append(" - Enjoy in default SD quality (480p).");

		return content.toString();
	}

	String streamContent(String movieTitle, int resolution) {
		StringBuilder content = new StringBuilder(movieTitle);
		content.append(" - Enjoy in ");
		content.append(resolution);

		return content.toString();
	}
}

/*
 * method overloading --> getting multiple functionality of a method with in a
 * class this is done at the compile time when the object is created there is no
 * such rules just method signature should be different like order, parameters,
 * data type
 */
