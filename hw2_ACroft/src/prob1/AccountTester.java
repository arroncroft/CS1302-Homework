// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 2
// Due:		2/3/16

package prob1;

public class AccountTester {

	//main: creates a test account to test the Account
	//	class and its methods.
	public static void main(String[] args){
		Account account1 = new Account(1122, 20000);
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("Balance:\t\t"+account1.getBalance());
		System.out.println("Monthly Interest:\t"+
							account1.getMonthlyInterest());
		System.out.println("Date Created:\t\t"+account1.getDateCreated());
	}
}
