package com.system.flipkartreturn;

/*
 * Behavior:

Override calculateRefundAmount to take the Level 2 refund amount and add giftCardBonus if the 
customer opts for Flipkart Wallet credit.
 */
public class InstantWalletRefund extends QualityCheckReturn {

	private double giftCardBonus;

	public InstantWalletRefund(String returnId, double orderAmount, boolean isTagIntact, double damagePenaltyAmount,
			double giftCardBonus) {
		super(returnId, orderAmount, isTagIntact, damagePenaltyAmount);
		this.giftCardBonus = giftCardBonus;
	}

	public InstantWalletRefund(String returnId, double orderAmount, String pickupPartner, boolean isTagIntact,
			double damagePenaltyAmount, double giftCardBonus) {
		super(returnId, orderAmount, pickupPartner, isTagIntact, damagePenaltyAmount);
		this.giftCardBonus = giftCardBonus;
	}
	public double getGiftCardBonus() 
	{
		return this.giftCardBonus;
	}

	@Override
	public double calculateRefundAmount() {
		return super.calculateRefundAmount() + this.giftCardBonus;
	}

}
