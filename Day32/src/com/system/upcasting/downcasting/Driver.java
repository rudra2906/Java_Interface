package com.system.upcasting.downcasting;

public class Driver {

	public static void main(String[] args) {
		{
			Employee e1 = new Employee();
			System.out.println();
			Manager m1 = new Manager();
			
			System.out.println();
			Employee e2 = new Manager(); //-- upcasting --> also known as auto up casting
			//parent class can refer to child object
			
			System.out.println();
			Manager m = (Manager)new Employee(); //--> Down casting child is reffering to
			//parent class object
			
		}

	}

}
