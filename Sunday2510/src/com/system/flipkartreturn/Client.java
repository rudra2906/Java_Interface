package com.system.flipkartreturn;

public class Client {

	public static void main(String[] args) {

		ReturnRequest returnOrder = new ReturnRequest("Ru23", 1200);
		System.out.println("Return amount: "+returnOrder.calculateRefundAmount());
		System.out.println();
		
		ReturnRequest returnOrder1 = new ReturnRequest("Ru433", -400,"MYNTRA LOGISTIC");
		System.out.println(returnOrder1.getPickupPartner());
		System.out.println("Return amount: "+returnOrder1.calculateRefundAmount());

		QualityCheckReturn qualityreturn = new QualityCheckReturn("S32842", 4850, false, 250);
		System.out.println(qualityreturn.calculateRefundAmount());
		
		QualityCheckReturn qualityreturn1 = new QualityCheckReturn("S3RU2", 8950,"KAER LOGISTIC", true, 250);
		System.out.println(qualityreturn1.calculateRefundAmount());
		
		
		InstantWalletRefund walletRefund = new InstantWalletRefund("IWR832", 600, "RUKART", false, 200, 100);
		System.out.println(walletRefund.calculateRefundAmount());
		InstantWalletRefund walletRefund2 = new InstantWalletRefund("IWR32", 1000, false, 200, 100);
		System.out.println(walletRefund2.calculateRefundAmount());
	}

}
