package com.system.payment.smart;

public interface RewardSystem {
	
	abstract void calculateReward(double amount);
	
	default void showRewardMessage() 
	{
		System.out.println("Congratulation You got a reward..");
	}
}
