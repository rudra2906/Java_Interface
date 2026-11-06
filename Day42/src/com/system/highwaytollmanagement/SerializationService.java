package com.system.highwaytollmanagement;

import java.io.*;

public class SerializationService {

	void tollSessions(TollSession tollData) throws IOException {
		FileOutputStream fos = new FileOutputStream("tollData.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(tollData);

		System.out.println("Serialization Done.");
		oos.close();
		fos.close();
	}

}
