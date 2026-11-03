package com.system.chatappmessage;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		ChatMessage message = new ChatMessage("29@ta", "Rudransh", "Soumya", "Heyy!! what are you doing");

		Whatsapp user = new Whatsapp();
		user.processor(message);
		
		System.out.println("Serilization done..");
	}

}
