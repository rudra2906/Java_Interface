package com.system.autodebitengine;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		PersistenceHandler handler = new PersistenceHandler();
		handler.recurring(new MandateProfile("RU779", "rudy@493", 45620, "838473HRUBE939"));

	}
}
