package com.system.kycverificationportal;

public class Driver {

	public static void main(String[] args) {
		
		String result = CloudBackupProcessor.cloudBackup(new UnverifiedGuestClass("234", "8776544656"));
		System.out.println("Backup result: "+result);
		
		String result2 = CloudBackupProcessor.cloudBackup(new VerifiedCustomerClass("94", "Rudy", "URDPP3598O"));
		System.out.println("Backup2 result"+ result2);
	}

}

/*
 * instance of --> it is a keyword which tell that object is sub class, interface of that class
 */
