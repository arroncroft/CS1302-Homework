// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 4
// Due:		2/24/16

package prob3;

import java.util.ArrayList;

public class PersonTester {
	//main
	public static void main(String[] args){
		Person p1 = new Person();
		p1.addAccount(new RegularAccount(2000));
		p1.addAccount(new PremiumAccount(3000));
		p1.addAccount(new RegularAccount(200));
		p1.addAccount(new RegularAccount(1000));
		p1.addAccount(new PremiumAccount(500));

		System.out.println("***Call toString() on Person after 5 accounts are added:");
		System.out.println(p1);
		System.out.println();

		System.out.println("***Call getNumAccounts(): " + p1.getNumAccounts() + "\n" );

		System.out.println("***Call getAccount(1): " + p1.getAccount(1) + "\n" );

		System.out.println("***Call getTotalBalance(): " + p1.getTotalBalance() + "\n" );

		System.out.println("***Call getPremiumAccounts()");
		System.out.println(" Loop over each PremiumAccount and print:");
		ArrayList<PremiumAccount> pAccounts = p1.getPremiumAccounts();
		for( PremiumAccount pa : pAccounts )
		System.out.println(pa);
		System.out.println();

		System.out.println("***Call applyInterest(), then print Person:");
		p1.applyInterest();
		System.out.println(p1);

	}
}
