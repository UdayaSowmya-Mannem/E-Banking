package com.Banking;
import java.util.Scanner;
public class Main {


		//JAVA Banking PROGRAM
		
		
		static Scanner sc=new Scanner(System.in);
		
		public static void main(String[] args) {
		double balance =0.0;
		boolean isRunning=true;
		int choice;
		
		//DIPLAY MENU
		while(isRunning) {
			
		System.out.println("================");
		System.out.println("BANKING PROGRAM");
		System.out.println("================");
		System.out.println("1. Show Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("================");
		
		
		//GET & PROCESS USER CHOICE
		
		System.out.println("Enter your choice(1-4): ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1->showBalance(balance);
		case 2->balance=balance+deposit();
		case 3->balance=balance-withdraw(balance);
		case 4->isRunning=false;
		default ->System.out.println("INVALID CHOICE");
		
		}
		
		}
		
		
		
		System.out.println("**************************");
		System.out.println("Thank you! have a nice Day");
		System.out.println("**************************");
		
		
		
		sc.close();
	    }
		
		
	
		//SHOWBALANCE
		static void showBalance(double balance) {
			System.out.println("===============");
			System.out.printf("Your balance: Rs %.2f%n",balance);
		}
		
		//DEPOSIT
		static double deposit() {
			
			System.out.println("Enter an amount to be deposited:");
			double amount=sc.nextDouble();
			
			if(amount < 0) {
				System.out.println("Amount cannot be negative");
				return amount;
			}
			else {
				return amount;
			}
		}
			
			//WITHDRAW
			static  double withdraw(double balance) {
				
				double amount;
				
				System.out.println("Enter amount to be withdraw:");
				amount=sc.nextDouble();
				
				if(amount >balance) {
					System.out.println("INSUFFICIENT FUNDS");
					return amount ;
				}
				
				else if(amount <0) {
					System.out.println("Amount cannot be negative");
					return amount;
				}
				
				else {
					return amount;
				}
				
				
			
			
			
		}
			
		
		}
		
	
		
	
	

