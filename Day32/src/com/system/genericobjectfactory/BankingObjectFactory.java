package com.system.genericobjectfactory;
/*
 * Behavior (getTransactionObject): Accepts a transactionType identifier. 
 * If "UPI" is requested, returns a new UpiTransaction instance; if "NEFT" is requested, returns 
 * a new NeftTransaction instance.
(Hint: Think carefully about what the return type of getTransactionObject must be so that a 
single method can return completely unrelated classes!)
 */
public class BankingObjectFactory {

	private String transactionType;
	
	public BankingObjectFactory(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public Object getTransactionObject() 
	{
		if(transactionType.equalsIgnoreCase("UPI")) 
		{
			return new UpiTransaction("Rudransh",150000);
		}
		else if(transactionType.equalsIgnoreCase("NEFT")) 
		{
			return new NeftTransaction("877040034346", "RU0000232", 150000.0);
		}
		return null;
	}
	
}
