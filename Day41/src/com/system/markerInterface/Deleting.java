package com.system.markerInterface;

public class Deleting {

	public void clean( Object obj ) 
	{
		if( obj instanceof Deletable) 
		{
			System.out.println("file is deleted");
		}
		else 
		{
			System.out.println("You are not priviliged to do so.");
		}
	}
	
}
