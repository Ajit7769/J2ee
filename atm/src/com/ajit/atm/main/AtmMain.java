package com.ajit.atm.main;

import java.util.Scanner;

import com.ajit.atm.interfaces.atmOperationInter;
import com.ajit.atm.resource.atmOpration;

public class AtmMain {
    
	public static void main(String[] args) {
		
		atmOperationInter account = new atmOpration();
		
		Scanner inScanner = new Scanner(System.in);
		
		System.out.println("Welcome to ATM ...\n");
		System.out.print("Enter Your ATM Number : ");
		int atmnumber = inScanner.nextInt();
		System.out.print("Enter Your ATM PIN :");
		int atmNumber = inScanner.nextInt();
		
		if(atmNumber == atmNumber) {
			System.out.println("plese wait.....");
			System.out.println("Hello"+ atmNumber+ " Successfully Login");
		}
		else {
			System.out.println("Plese Enter Correct Atm Number or Atm Pin \n Try Again.....");
		}
		
		
		System.out.println("Menu \n 1.Check Balence \n 2.Deposite Amount \n 3.Withdraw Amount \n 4.Mini Statement \n 5.Ext");
		
		System.out.print("Enter Your Choice hre : ");
		
		int menu = inScanner.nextInt();
		if(menu == 1) { 
			account.viewBalance();
			
		}
		else if(menu == 2) {
			System.out.print("Enter Deposit Amount : ");
			double deposit = inScanner.nextDouble();
			account.depositeAmount(deposit);
		}
		else if(menu == 3) {
			System.out.print("Enter Withdraw Amount :  ");
			double withdrawAmount = inScanner.nextDouble();
			account.withdrawAmount(withdrawAmount);
		}
		else if(menu == 4) {
			account.viewBalance();
		}
		else if(menu == 5) {
			System.out.println("Collect Your ATM \n Thank You......!");
			System.exit(0);
		}
		
	}
}
