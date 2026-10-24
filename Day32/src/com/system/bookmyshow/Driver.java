package com.system.bookmyshow;

public class Driver {

	public static void main(String[] args) {
		
//		OttPlatform user = new OttPlatform("Jio Hotstar", 200);
//		System.out.println(user.getPlatformName());
//		System.out.println(user.getSubscriptionPrice());
//		System.out.println(user.streamContent("MSD UNTOLD STORY."));
//		System.out.println(user.streamContent("TITANIC",1080));
//		OttPlatform.checkServerStatus();
//
//		System.out.println("*******************************************");
//		JioCinemaPremium user1 = new JioCinemaPremium("JIO Cinema", 500, true);
//		System.out.println(user1.getPlatformName());
//		System.out.println(user1.getSubscriptionPrice());
//		System.out.println(user1.getDolbyAtomsEnabled());
//		System.out.println(user1.streamContent("JANE TU YA JANE NAAA.."));
//		System.out.println(user1.streamContent("SOORMA", 1040));
//		JioCinemaPremium.checkServerStatus();
//		
//		System.out.println("*******************************************");
//		
//		OttPlatform user2 = new JioCinemaPremium("JIO", 458, true);
//		System.out.println(user2.getPlatformName());
//		System.out.println(user2.getSubscriptionPrice());
//		//System.out.println(user2.getDolbyAtomsEnabled());
//		OttPlatform.checkServerStatus();
//		JioCinemaPremium.checkServerStatus();
//		System.out.println(user2.streamContent("JAILER", 1020));
//		user2.checkServerStatus();
		
		
		OttPlatform user2 = new JioCinemaPremium("JIO", 458, true);
		user2.display();
		//user2.streamContent()

	}

}
/*
 * Demonstrating Method Hiding in the Driver class using OttPlatform ott = new JioCinemaPremium()
 * ; and explaining in a comment why ott.checkServerStatus() calls OttPlatform's static 
 * method while ott.streamContent(...) calls JioCinemaPremium's overridden instance method
 * 
 * this is happening because of static belongs to class so when ott refrence object calls it will 
 * provide that class static method checkserverstatus 
 * 
*/