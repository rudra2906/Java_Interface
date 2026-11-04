package com.system.irctcpnrpassengersnapshot;

public class IrctcBackup {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Ticket user = new Ticket("9887554185", "Rudransh Patel", 10, 1845);
		
		Ticket userBackup = (Ticket)user.clone();
		
		userBackup.setBerthNumber(74);
		
		System.out.println("Original seat: "+ user.getBerthNumber());
		System.out.println("Cloned seat: "+ userBackup.getBerthNumber());
		
	}
	
}
/*
 * cloning -> means copying of actual heap object data 
 * it is of two type 
 * shallow cloning -> Means copying of actual object except nested object which shares same refrence on heap
 * deep cloning -> means copying of actual object with the nested object generated into the heaps
 *   
 * if i remove implements clonable will get the exception of clonenotsupportedexception because it is the crucial process and it requires
 * special permission to clone the object that was give by an Cloneable interface
 */
