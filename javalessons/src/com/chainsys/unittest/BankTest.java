package com.chainsys.unittest;

import com.chainsys.variables.Bank;
/**
 * 
 * @author shei3123
 *
 */
public class BankTest {

	public static void testDeposit() {
//		System.out.println("Before Balance " + Bank.currentBalance);
		System.out.println("deposit amount is 10000" );
		Bank.deposit(10000);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Bank.currentBalance);
		int withdraw = Bank.withdraw(5000);
		System.out.println("Withdraw amount is " + withdraw);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testOpenaccount() {
		Bank.openAccount("sheik", 12345);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);

	}
}