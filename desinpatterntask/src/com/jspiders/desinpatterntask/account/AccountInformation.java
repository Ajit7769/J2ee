package com.jspiders.desinpatterntask.account;



public class AccountInformation {
	static AccountInformation account;
	
	public double accountBalance;

	public AccountInformation(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public static AccountInformation getobject() {
		if(account==null) {
			account=new AccountInformation(10000);
		}
		return account;
	}

}
