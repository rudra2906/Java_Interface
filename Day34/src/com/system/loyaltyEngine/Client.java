/*
 * Driver Class Requirements:

Create instances of GroceryCartOrder and ElectronicsCartOrder.

Pass both child instances to all 3 overloaded versions of processCheckout() in CheckoutProcessingEngine.

In comments, identify which method calls are resolved at compile time (overload resolution based on signature) and 
which are resolved at runtime (dynamic dispatch on computeFinalBill()).

 */

package com.system.loyaltyEngine;

public class Client {

	public static void main(String[] args) {

		Processor process = new Processor();
		process.processCheckout(new CartOrder("MN98382", "rudransh2@gmail.com", 2000));

		System.out.println();
		process.processCheckout(new CartOrder("BV98382", "rudr2@gmail.com", 2000), "FLIPKART50");
		System.out.println();
		process.processCheckout(new CartOrder("CX382", "vidit2@gmail.com", 2500), "FLIPKART50", true, 100);

		System.out.println("*********************");
		process.processCheckout(new GroceryCartOrder("LK76", "rudransh4432@gmail.com", 6548, 50, 199));
		System.out.println();
		process.processCheckout(new GroceryCartOrder("AS76", "ansh42@gmail.com", 7000, 50, 199), "flipkart50");
		System.out.println();
		process.processCheckout(new GroceryCartOrder("PY54", "pryansh42@gmail.com", 900, 50, 199), null, true, 100);

		System.out.println("************************");
		process.processCheckout(new ElectronicsCartOrder("YI90", "Yogesh32@gmail.com", 940, 20, 40), "flipKart50", true,
				20);

		process.processCheckout(new ElectronicsCartOrder("Z0093", "Ramesh42@gmail.com", 768, 44, 57));

		process.processCheckout(new ElectronicsCartOrder("YI6", "esh32@gmail.com", 940, 10, 60), "flipKart50");

	}

}

/*
 * upcasting -> parent class refrence is assing to the child class object it is
 * also know as autoUpcasting here in method processCheckout()--> im passing the
 * childs object to parent refrence there upcasting is happening polymorphism->
 * poly means many morphism means forms when method with same name have
 * difference functionality with in same class is know as method overloading
 * also know as the compile time polymorphisms there is no rule rather then
 * method signature should be different means number of paramenters, order, data
 * type of parameters should be different
 * 
 * method overloading is achieve in Processor class where i have same method
 * name with different functionality method is called at compile time base on
 * argments
 * 
 * when method act differently based on the object is know as method run time
 * polymorphism, or when derived class method with same name has different
 * functionality is know as method overriding it is achieved by overriding there
 * are some rule of overriding method name should be same method return type
 * should be same or covairant mean there sub class method access modifier
 * should be same or broder but not narrow method parameters should be same,
 * order should be same, data type should be same
 * 
 * method overriding in this question is achieved in computeFinalBill() and
 * finalAmount() where child class inherit the method but has their own
 * fuctionality also i have used the encapsulation where binding of the
 * attribute to the behaviours so that it cannot be accessible or modified from
 * outside the class directly it can be modified but with controled way
 * inheritance where ElectronicsCartOrder and GroceryCartOrder has all the
 * property of the parent class CartOrder this helped me to reuse the code
 * abstraction -> achieved the low level abstraction by hiding the core
 * functionality and exposing the required functionality
 * 
 * SOLID principle --> my code is achiveing the Single responsibility and Open
 * to extend but close to modification as my each class has single
 * responsibility of doing work i can add as much as classes
 */