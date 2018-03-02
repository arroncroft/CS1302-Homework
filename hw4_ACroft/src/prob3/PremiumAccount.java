// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 4
// Due:		2/24/16

package prob3;

public class PremiumAccount extends Account {
	//constructor
	public PremiumAccount(double balance){
		super(balance);
	}

	//applyInterest: applies 1.5% interest to the
	//	entire balance.
	public void applyInterest(){
		balance = balance + (balance * (0.015));
	}
}
