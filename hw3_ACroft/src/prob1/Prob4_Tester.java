// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob1;

public class Prob4_Tester {

	//main
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(3344, 1000.0, 2000.0);
		ca.setOverdraftLimit(500.0);
		printOverdraftLimit(ca);

		Account a = new SavingsAccount(3344, 1000.0);
		printOverdraftLimit(a);
	}

	//printOverdraftLimit: Accepts an account, checks to see
	//	if it's a CheckingAccount, and prints its overdraftLimit
	//	if it is. Otherwise, prints "not applicable".
	public static void printOverdraftLimit(Account a){
		if(a instanceof CheckingAccount){
			System.out.println(((CheckingAccount)a).getOverdraftLimit());
		}
		else {
			System.out.println("Not applicable");
		}
	}
}
