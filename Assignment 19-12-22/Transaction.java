package basic;

import java.util.Scanner;

public class Transaction {
	
	public static double withdraws(double balance, double amount) {
		double withdraw=0;
		if(amount<=balance) {
			withdraw = balance- amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
		return withdraw;
	}
	public static double deposits(double balance, double amount) {
		double deposit = balance + amount;
		return deposit;
	}

	public static void main(String[] args) {
		int choice;
		double balance,amount,withdraw,deposit;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose any one");
		System.out.println("1)Withdraw \n2)Deposit");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter your balance");
			balance=sc.nextDouble();
			System.out.println("Enter the amount that you want to withdraw");
			amount = sc.nextDouble();
			withdraw =Transaction.withdraws(balance, amount);
			System.out.println("Remaining balance = "+withdraw);
			break;
		case 2:
			System.out.println("Enter your balance");
			balance=sc.nextDouble();
			System.out.println("Enter the Deposit amount");
			amount = sc.nextDouble();
			deposit = Transaction.deposits(balance, amount);
			System.out.println("Remaining balance = "+deposit);
			break;
			
		}
			

	}

}
