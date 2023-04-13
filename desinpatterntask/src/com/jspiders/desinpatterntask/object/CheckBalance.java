package com.jspiders.desinpatterntask.object;

import com.jspiders.desinpatterntask.account.AccountInformation;


public class CheckBalance {

	AccountInformation account=AccountInformation.getobject();
	public void checkBalance() {
		System.out.println("Available account balance is :"+account.accountBalance);
	}

	

}
