package com.system.chatappmessage;

import java.io.*;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\Java\\Day40\\personalMessage.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ChatMessage message = (ChatMessage)ois.readObject();
		
		System.out.println(message.messageInfo());
		fis.close();
		ois.close();
	}
}
