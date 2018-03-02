// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 4
// Due:		2/24/16

package prob2;

import java.text.NumberFormat;

public abstract class Account {
	//data fields
	protected double balance;
	protected NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

	//constructor: accepts an initial balance
	protected Account(double balance) {
		this.balance = balance;
	}

	//deposit: allows money to be added to balance
	public void deposit(double amount){
		balance += amount;
	}

	//withdraw: allows money to be subracted from
	//	balance
	public void withdraw(double amount){
		balance -= amount;
	}

	//applyInterest: abstract method that applies
	//	interest in varying forms
	public abstract void applyInterest();

	//toString: prints the account's balance
	@Override
	public String toString(){
		return "The balance is "+numberFormat.format(balance)+".";
	}

}
