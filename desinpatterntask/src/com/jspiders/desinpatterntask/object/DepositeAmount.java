package com.jspiders.desinpatterntask.object;

import com.jspiders.desinpatterntask.account.AccountInformation;

public class DepositeAmount {

	double depositeAmount;

	public DepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	
	public void deposite(double amount) {
		AccountInformation account=AccountInformation.getobject();
		account.accountBalance+=amount;
		System.out.println("Available balance:"+account.accountBalance);
	}
}
