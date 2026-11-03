package com.system.chatappmessage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Whatsapp {

	void processor(ChatMessage message) throws IOException {
		FileOutputStream fos = new FileOutputStream("personalMessage.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(message);

		fos.close();
		oos.close();

	}

}
