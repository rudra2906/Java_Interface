package com.system.bookmyshow;

public class JioCinemaPremium extends OttPlatform {

	private boolean dolbyAtomsEnabled;
	private int maxDeviceAllowed;

	public JioCinemaPremium(String platformName, double subscriptionPrice, boolean dolbyAtomsEnabled) {
		super(platformName, subscriptionPrice);
		this.dolbyAtomsEnabled = dolbyAtomsEnabled;
		this.maxDeviceAllowed = 5;
	}

	public boolean getDolbyAtomsEnabled() {
		return this.dolbyAtomsEnabled;
	}

	public int maxDeviceAllowed() {
		return this.maxDeviceAllowed;
	}

	public void display() {
		System.out.println("JioCinemaPremium.display()");
	}
	public static void checkServerStatus() {
		System.out.println("JioCinema 4K Server is Online");
	}

	@Override
	public String streamContent(String movieTitle, int resolution) {
		StringBuilder result = new StringBuilder("Enjoy Your Movie ");
		result.append(super.streamContent(movieTitle, resolution));
		if (this.dolbyAtomsEnabled) {

			result.append(" with Dolby Atmos + Ad-Free");
			return result.toString();
		} else {
			return result.toString();

		}
	}

}

/*
 * Inheritance - Derived class can inherit the property of parent class.
 * advantage is == codereuseAbility, easy to maintain disadvantage = tightly
 * coupled , hard load everytime
 * 
 * method overriding = child can use the method of parent class with
 * modification .it is also know as the run time polymorphism. @Override is
 * anotation which check the rule of overriding some rule are - method return
 * type should be same or covariant, method access modifier should be same or
 * wider compare to them but not narrow , parameters should be same, order
 * should be same , data type of method should be same static method can not be
 * overriden because static belongs to class so refrence of variable type static
 * method will used
 */
