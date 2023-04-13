package com.jspiders.desinpatterntask.object;

import com.jspiders.desinpatterntask.account.AccountInformation;

public class WithdrawAmount {

	double withDrawAmount;

	public WithdrawAmount(double withDrawAmount) {
		this.withDrawAmount = withDrawAmount;
	}
	
	public void withdraw(double amount) {
		AccountInformation account=AccountInformation.getobject();
		if(account.accountBalance<amount) {
			System.out.println("Insificient Balance");
		}
		else {
			account.accountBalance-=amount;
			System.out.println("Available balance:"+account.accountBalance);
		}
		

		
	}
}
