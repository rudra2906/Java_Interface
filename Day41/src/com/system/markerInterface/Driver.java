package com.system.markerInterface;

public class Driver {

	public static void main(String[] args) {
		User user = new User("Rudransh", "afe23", 20);
		
		Deleting delete = new Deleting();
		delete.clean(user);
	}
}
