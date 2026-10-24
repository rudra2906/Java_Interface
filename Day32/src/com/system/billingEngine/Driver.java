package com.system.billingEngine;

public class Driver {

	public static void main(String[] args) {

		DeliveryPartner p1 = new InstamartPartner("@#$@HR", "SURAJ", 560, 150);
		System.out.println(p1.calculatePayout());
	
		
		DeliveryPartner p2 = new IntercityPartner("SD@#", "Sallu", 560, 200);
		System.out.println(p2.calculatePayout());
		
		InstamartPartner p3 = (InstamartPartner) p1;
		p3.claimRainSurgeBonus(100);
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

/*
 * polymorphisms poly means many, morphisms means forms --> many forms method
 * can have a different functionaliy with in a same class is also know as method
 * complie time ploymorphism method can behave differently based on a object
 * type --> run time polymorphisms
 * 
 * DeliveryPartner p1 = new InstamartPartner("@#$@HR", "SURAJ", 560, 150); in
 * this line upcasting is done means => child object is reffered by parents
 * refrence ,p1 here is of type parent DeliveryPartner which reffring its child
 * object
 * 
 * at the run time p1.calculatePayout(); --> first complier will check method is
 * present or not in parent class 
 * then at run time the object will be created of child instamartpartner
 * this will call the method of actual object
 * 
 * DeliveryPartner p2 = new IntercityPartner("SD@#", "Sallu", 560, 200);
 * in this line first complier will check the method is present or not 
 * then at the run time the object is created of interctiypartner and method is called in next line
 * 
 * 
 * 
 * 	InstamartPartner p3 = (InstamartPartner) new DeliveryPartner("WE#", "TANU", 670);
 * 	p3.calculatePayout();
 * getting class caste exception because im down casting which deliverypartner has a instamart partner
 * so, instamartpartner is child refference is parents object
 * 
 * i have one doubt why with Parentrefrence p1 = new Childobj() , childs object an method is present inside the child class like display 
 * why i cannot call that p1.display()
 */
