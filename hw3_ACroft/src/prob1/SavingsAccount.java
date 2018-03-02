// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob1;

public class SavingsAccount extends Account {

	//constructor
	public SavingsAccount(int id, double balance){
		super(id, balance);
	}

	//withdraw: Overrides superclass' withdraw method
	//	so that you can't go into the negative numbers.
	@Override
	public void withdraw(double amount){
		if(getBalance()-amount > 0){
			setBalance(getBalance() - amount);
		}
	}
}
