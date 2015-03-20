package com.wayne.thread;

public class Account11 {

	private int balance = 10000;
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void transfer(Account11 acc1, Account11 acc2, int amount) {
		acc1.withdraw(amount);
		acc2.deposit(amount);
	}
}
