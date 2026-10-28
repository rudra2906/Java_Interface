/*
 * Hold both child objects using UpiMandate parent references (Upcasting) and trigger auto-debits.

Write a commented-out line attempting new UpiMandate(...) and explain in a comment why Java forbids instantiating an abstract class directly, 
even though UpiMandate has a constructor!
 */

package com.system.mandateengine;

public class Driver {

	public static void main(String[] args) {
		
		UpiMandate user = new TelecomBillMandate("!@#@2343", "rudy@32", "SLICE", 70000, "JIO", "8770400437");
		System.out.println(user.triggerAutoDebit(600));
		
		UpiMandate user2 = new MutualFundSipMandate("9023@3EF", "somya@32", "GPAY", 50000, "23JQA", "NAME", 1.1);
		System.out.println(user2.triggerAutoDebit(400));

	}

}
/*
 *Java forbids instantiating an abstract class directly because UpiMandate is a abstract class and in that class there are method which is not initialize thats why 
 *java give compilation error it should be used by means extended by child class 
 *i can use child object to initilize the parent attribute 
 */
