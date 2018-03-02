// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob1;

public class AccountTester {

	//main
	public static void main (String[] args) {
		//creates CheckingAccount and attempts to withdraw
		//	money to ensure the overdraftLimit works.
		CheckingAccount account = new CheckingAccount(1122, 1000.0, 5000.0);
		printCheckingInfo(account);
		account.withdraw(2000.0);
		printCheckingInfo(account);
		account.withdraw(5000.0);
		printCheckingInfo(account);
		account.setOverdraftLimit(2000.0);

		printCheckingInfo(account);
		account.withdraw(1001.0);
		printCheckingInfo(account);
		account.withdraw(999.0);
		printCheckingInfo(account);
		//creates CheckingAccount and attempts to withdraw
		//	money to ensure it doesn't go below zero.
		SavingsAccount sAccount = new SavingsAccount(1122, 1000.0);
		printSavingsInfo(sAccount);
		sAccount.withdraw(1001.0);
		printSavingsInfo(sAccount);
		sAccount.withdraw(999.0);
		printSavingsInfo(sAccount);
	}

	//printCheckingInfo: Prints info about designated
	//	CheckingAccount.
	public static void printCheckingInfo(CheckingAccount acnt) {
		System.out.printf("Bal: $%4.2f, overdraft limit: $%4.2f\n", acnt.getBalance(),
		acnt.getOverdraftLimit());
	}

	//printSavingsInfo: Prints info about designated
	//	SavingsAccount.
	public static void printSavingsInfo(SavingsAccount acnt) {
		System.out.printf("Bal: $%4.2f\n", acnt.getBalance());
	}
}
