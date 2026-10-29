/*
 * 
Child Interface (ITatkalFareRule extends IBaseFareRule):

Constant: TATKAL_MIN_SURGE (set to 300).

Additional Abstract Contract:

applyTatkalDynamicPricing — takes the calculated base fare and current seat occupancy percentage, and returns the final Tatkal fare.
 */
package com.system.taxengine;

public interface ITatkalFareRule extends IBaseFareRule{

	public final static double TATKAL_MIN_SURGE = 300.0;
	
	public abstract double applyTatkalDynamicPricing();
	
}
/*
 * attribute inside the interface will by default public static final --> means constant 
 */
