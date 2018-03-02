// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 4
// Due:		2/24/16

package prob2;

public class AccountTester {
	//main: creates test accounts and applies their
	//	methods.
	public static void main(String[] args){
		Account ac1 = new RegularAccount(500);
		System.out.println(ac1);
		ac1.applyInterest();
		System.out.println(ac1);
		ac1.deposit(1200);
		System.out.println(ac1);
		ac1.applyInterest();
		System.out.println(ac1);
		ac1.withdraw(1000);
		System.out.println(ac1);
		ac1.applyInterest();
		System.out.println(ac1);

		PremiumAccount pacc1 = new PremiumAccount(500);
		System.out.println(pacc1);
		pacc1.applyInterest();
		System.out.println(pacc1);
		pacc1.deposit(1200);
		System.out.println(pacc1);
		pacc1.applyInterest();
		System.out.println(pacc1);
	}
}
