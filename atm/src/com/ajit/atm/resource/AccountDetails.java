package com.ajit.atm.resource;

public class AccountDetails {
    
	private double accountBalence;
	private double depositeAmount;
	private double withdrawAmount;
	
	
	public AccountDetails() {
		
	}


	public double getAccountBalence() {
		return accountBalence;
	}


	public void setAccountBalence(double accountBalence) {
		this.accountBalence = accountBalence;
	}


	public double getDepositeAmount() {
		return depositeAmount;
	}


	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}


	public double getWithdrawAmount() {
		return withdrawAmount;
	}


	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
	
}
