package com.system.memory;

public class PractiseMemoryOptimization {

	Address a;
	
	public void PractiseUnusedObject() {
		System.out.println("Hello");
		a = new Address("Rudy", "8770400443","UUR3");
		System.out.println(a.getName());
		
		a = null;
		//a.close()
		a = new Address("yash", "879874", "hare2");
		System.out.println(a.getName());
		
		a= null;
		
		//a.getName();
		
	}
	public static void main(String[] args) {
		System.out.println();
		PractiseMemoryOptimization p = new PractiseMemoryOptimization();
		p.PractiseUnusedObject();
	}
}
