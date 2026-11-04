package com.system.kycverificationportal;

public class CloudBackupProcessor {

	public static String cloudBackup(Object obj) {
		StringBuilder sb = new StringBuilder();
		if (obj instanceof IKycVerification) {
			sb.append("Profile is authorized");
			sb.append("\nrecord to backup");
			return sb.toString();
		} else {
			sb.append("An access denial error blocking the operation.");
			return sb.toString();
		}

	}

}
