/*
 * Parent Interface (IBaseFareRule):

Overloaded Abstract Contracts:

calculateFare (1 parameter: base distance in km)

calculateFare (2 parameters: base distance in km, and coach class code like "3A" or "EC")

 */

package com.system.taxengine;

public interface IBaseFareRule {
	
	public abstract double calculateFare(double baseDistance);
	double calculateFare(double baseDistance, String coachClass);

}

/*
 * Interface is a class blueprint or a contract which tell what to do without telling how to do inside the interface the method by default will be public abstract 
 * because abstract means idea and abstract method do not have a body means that can be initialize without body
 */
