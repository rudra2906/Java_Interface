package com.system.methodhiding;

public class BankServer {

	public static void ping() {
		System.out.println("BankServer.ping()");
	}

}

class HdfcServer extends BankServer {
	public static void ping() {
		System.out.println("HdfcServer.ping()");
	}
}
