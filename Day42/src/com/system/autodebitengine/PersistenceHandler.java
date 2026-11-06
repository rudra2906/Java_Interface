package com.system.autodebitengine;

import java.io.*;

public class PersistenceHandler {

	public void recurring(MandateProfile profile) throws IOException {
		FileOutputStream fos = new FileOutputStream("mandate_queue.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(profile);

		System.out.println("Serialization Done");
		oos.close();

	}

}
