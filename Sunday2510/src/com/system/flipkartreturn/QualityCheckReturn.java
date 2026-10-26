package com.system.flipkartreturn;

/*
 * Level 2 Intermediate Class (QualityCheckReturn extends ReturnRequest):

Attributes: isTagIntact, damagePenaltyAmount

Behavior:

Override calculateRefundAmount: If isTagIntact is true, return the full parent refund amount; 
otherwise, deduct damagePenaltyAmount.
 */
public class QualityCheckReturn extends ReturnRequest {

	private boolean isTagIntact;
	private double damagePenaltyAmount;

	public QualityCheckReturn(String returnId, double orderAmount, String pickupPartner, boolean isTagIntact,
			double damagePenaltyAmount) {
		super(returnId, orderAmount, pickupPartner);
		this.isTagIntact = isTagIntact;
		this.damagePenaltyAmount = damagePenaltyAmount;

	}

	public QualityCheckReturn(String returnId, double orderAmount, boolean isTagIntact, double damagePenaltyAmount) {
		super(returnId, orderAmount);
		this.isTagIntact = isTagIntact;
		this.damagePenaltyAmount = damagePenaltyAmount;

	}
	public boolean getIstagIntact() 
	{
		return this.isTagIntact;
	}
	public double getDamagePenaltyAmount() 
	{
		return this.damagePenaltyAmount;
	}

	@Override
	public double calculateRefundAmount() {
		if (isTagIntact) {
			return super.calculateRefundAmount();
		} else {
			return super.calculateRefundAmount() - this.damagePenaltyAmount;
		}
	}
}
