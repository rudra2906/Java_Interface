package com.system.zomato;

public class Address {

	private String line1;
	private String line2;
	private String city;
	public Address(String line1, String line2, String city) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
	}
	public String getLine1() {
		return line1;
	}
	public String getLine2() {
		return line2;
	}
	public String getCity() {
		return city;
	}
	
	public void setLine1(String value) 
	{
		this.line1 = value;
	}
	public void setLine2(String value) 
	{
		this.line2 = value;
	}
	public void setCity( String value ) 
	{
		this.city = value;
	}
}
