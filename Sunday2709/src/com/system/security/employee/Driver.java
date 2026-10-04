package com.system.security.employee;

public class Driver {

	public static void main(String[] args) {
		SystemAdministrator user1 = new SystemAdministrator("Rudransh", "Developer", 123);
		user1.accessSystem();
		
		System.out.println("************************************");
		
		SystemAdministrator user2 = new SystemAdministrator("ansh", "Developer", 12);
		user2.accessSystem();
		
		System.out.println("**************************************");
		SystemAdministrator user3 = new SystemAdministrator("akash", "finance", 123);
		user3.accessSystem();

		
	}

}
