// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 4
// Due:		2/24/16

package prob3;

import java.util.ArrayList;

public class Person {
	//data fields
	private ArrayList<Account> accounts = new ArrayList<Account>();

	//addAccount: adds account to ArrayList
	public void addAccount(Account a){
		accounts.add(a);
	}

	//getAccount: retrieves account from
	//	ArrayList
	public Account getAccount(int i){
		return accounts.get(i);
	}

	//getNumAccounts: returns the number of
	//	accounts in the ArrayList
	public int getNumAccounts(){
		return accounts.size();
	}

	//getTotalBalance: returns the balance of
	//	all accounts in ArrayList
	public double getTotalBalance(){
		double totalBalance = 0;
		for (Account a: accounts){
			totalBalance += a.balance;
		}
		return totalBalance;
	}

	//applyInterest: applies interest
	public void applyInterest(){
		for (Account a: accounts){
			a.applyInterest();
		}
	}

	//getPremiumAccounts: returns PremiumAccounts from
	//	the ArrayList of all accounts.
	public ArrayList<PremiumAccount> getPremiumAccounts(){
		ArrayList<PremiumAccount> premiumAccounts = new ArrayList<PremiumAccount>();
		for (Account a: accounts){
			if(a instanceof PremiumAccount){
				premiumAccounts.add((PremiumAccount)a);
			}
		}
		return premiumAccounts;
	}

	//toString: prints number of accounts, the toString
	//	of each of the accounts, and the total balance
	//	of all of them.
	@Override
	public String toString(){
		String ret = "Num Accounts: "+getNumAccounts()+"\n";
		for (Account a: accounts){
			ret += a + "\n";
		}
		ret += "Total Balance: "+getTotalBalance();
		return ret;
	}
}
