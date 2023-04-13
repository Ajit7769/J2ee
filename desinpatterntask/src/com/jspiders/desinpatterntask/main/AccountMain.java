package com.jspiders.desinpatterntask.main;

import java.util.Scanner;

import com.jspiders.desinpatterntask.object.CheckBalance;
import com.jspiders.desinpatterntask.object.DepositeAmount;
import com.jspiders.desinpatterntask.object.WithdrawAmount;

public class AccountMain {

	static boolean start = true;

	public static void main(String[] args) {
		AccountMain accountMain = new AccountMain();
		boolean start = true;
		while (start) {
			accountMain.Operations();
		}
	}

	private void Operations() {
		System.out.println("==== WelCome To Account =====");

		System.out.println("\n Plese Select options\n");

		System.out.println("1.Check Balence\n" + "2.Deposit Amount\n" + "3.Withdraw Amount\n" + "4.Exit");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		switch (choice) {
		case 1:
			System.out.println("Checking balance....");
			CheckBalance checkBalance = new CheckBalance();
			checkBalance.checkBalance();
			break;
		case 2:

			System.out.println("Enter amount to Deposite");
			Double amount = scanner.nextDouble();
			DepositeAmount deposite = new DepositeAmount(amount);
			deposite.deposite(amount);
			break;
		case 3:
			System.out.println("Enter amount to WithDraw....");
			double cashWithdraw = scanner.nextDouble();
			WithdrawAmount withdraw = new WithdrawAmount(cashWithdraw);
			withdraw.withdraw(cashWithdraw);
			break;
		case 4:
			System.out.println("Thank You......!");
			start = false;
		default:
			System.out.println("Inavalid Choice");
			break;
		}
//		return choice;

	}
}
