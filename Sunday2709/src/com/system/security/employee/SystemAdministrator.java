package com.system.security.employee;

public class SystemAdministrator implements Employee , SecurityAccess {

	private String userName;
	private String domain;
	private static final int CHECKPASSWORD = 123;
	private int enterPassword;
	
	public SystemAdministrator(String _userName, String _domain, int _enterPassword) {
		this.userName = _userName;
		this.domain = _domain;
		this.enterPassword = _enterPassword;
	}
	
	@Override
	public void work() 
	{
		if(domain.equalsIgnoreCase("Developer")) 
		{
			System.out.println("your todays task");
			System.out.println("write a code");
		}
		else 
		{
			System.out.println("your todays task");
			System.out.println("do a financial analysis");
		}
	}
	
	@Override
	public void securityCheck()
	{
		if(enterPassword == CHECKPASSWORD) 
		{
			System.out.println("Password matched!!! You can access your system");
			this.attendance();
			this.work();
		}
		else 
		{
			System.out.println("Try again");
			Employee.companyPolicy();
		}
	}
	public void accessSystem() 
	{
		System.out.println( Employee.COMPANY_NAME +"Welcome's You");
		System.out.println( this.userName +" Your verification is under Process");
		this.securityCheck();
		
	}

}