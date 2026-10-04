package com.system.payment.smart;

public class CreditCardPayment implements OnlinePayment, RewardSystem {
	
		private String userName;
		
		CreditCardPayment(String _userName)
		{
			this.userName = _userName;
		}
		
		@Override
		public void makePayment(double amount)
		{
			//static method
			System.out.println("You want to make a payment. Here is our policy");
			OnlinePayment.paymentPolicy();
			System.out.println("Your payment of rupees: "+ amount+ " is succesful ");
			
			if(amount >100) {
				this.showRewardMessage();
				calculateReward(amount);
			}
			else {
				generateReceipt();
			}
		}
		
		@Override
		public void calculateReward(double amount) 
		{
			double reward= amount *  0.2;
			System.out.println("this is your reward: " + (reward));
			generateReceipt();
		}
		
		
		@Override
		public void generateReceipt()
		{
			System.out.println(this.userName + " Your money is transffered successfully");
			System.out.println("Thankyou for using " + OnlinePayment.PAYMENT_GATEWAY);
				
		}
}
