package com.ajit.atm.resource;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.ajit.atm.interfaces.atmOperationInter;

public class atmOpration implements atmOperationInter{
	
	Map<Double,String> miniStatement = new HashMap<>();
 
	AccountDetails accountDetail = new AccountDetails();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balence is : "+ accountDetail.getAccountBalence());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		miniStatement.put(withdrawAmount,"Amount Is Debited");
		if(withdrawAmount<=accountDetail.getAccountBalence()) {
			System.out.println("Collect Your Cash "+withdrawAmount+ "\n Thank You...!");
			accountDetail.setAccountBalence(accountDetail.getAccountBalence() - withdrawAmount);
			viewBalance();
		}
		else {
			System.out.println("Insufficient Fund.....\n Plese Deposite Amount");
		}
	}

	@Override
	public void depositeAmount(double depositeAmount) {
		// TODO Auto-generated method stub
		miniStatement.put(depositeAmount,"Amount Is Credited");
		System.out.println(depositeAmount+" Cash Deposite Successfully");
		accountDetail.setAccountBalence(accountDetail.getAccountBalence()+depositeAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Entry<Double, String> m:miniStatement.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
