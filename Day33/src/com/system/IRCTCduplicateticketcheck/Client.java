package com.system.IRCTCduplicateticketcheck;

public class Client {

	public static void main(String[] args) {
		IrctcPassenger p1 = new IrctcPassenger("Rudransh", "93885079388", 22, "b2");
		IrctcPassenger p2 = new IrctcPassenger("Rudransh", "93885079388", 22, "b2");
		IrctcPassenger p3 = new IrctcPassenger("rudy", "5079388", 24, "c9");
		System.out.println();
		
		Object p4 = new IrctcPassenger("Test", "898962", 20, "F3");
		IrctcPassenger i1 = (IrctcPassenger)p4;
		System.out.println(i1.getAadhaarNumber());
		System.out.println(p4.equals(p4));


		System.out.println(p1 == p2 );//false two different object in heap of irctcpassenger which is refferd by p1 and p2 == compare the object refrence
		System.out.println(p1.equals(p2));//true 
		System.out.println(p1.equals(p3));//false

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * by achieving polymorphism we have override the method of object class equals in irctc 
		 * in the .equals method we take argumnt as object type then we have downcasted it 
		 * because we want the method and at .equals to behave check both content insted of refrence 
		 * run time of irctcpassenger and before overriding it takes the argument of object type and
		 *  we need to explicitly tell that it is of type irctcpassenger to jvm
		 * 
		 * IrctcPassenger invalid = (IrctcPassenger) new Object();
		 * this is invalid because IrctcPassenger is child and Object is parent and it can contain any type of object 
		 * so jvm will look that method is present or not of irctc passenger and then ill do transfer by give exception 
		 * because jvm dont know the run time object is of which type 
		 */
	}

}
