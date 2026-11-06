package com.system.highwaytollmanagement;

import java.io.IOException;

public class FASTagLane {

	public static void main(String[] args) throws IOException {
		SerializationService ser = new SerializationService();
		ser.tollSessions(new TollSession("UI834", "8375UUIO32", 450, "7789"));

	}

}
/**
 * Exception in thread "main" java.io.NotSerializableException:
 * com.system.highwaytollmanagement.TollSession as serialization is crucial
 * process and it requires special permission to implement serializable inteface
 * that will allow to do serialization if i is not implemented then TollSession
 * will throw exception at the time of serialization
 * 
 */
