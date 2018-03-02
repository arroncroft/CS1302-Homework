// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob1;

public class CheckingAccount extends Account {
	//variables
	double overdraftLimit;

	//constructor
	public CheckingAccount(int id, double balance,
						   double overdraftLimit){
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	//getOverdraftLimit: returns the overdraft limit.
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	//setOverdraftLimit: sets the overdraft limit.
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	//withdraw: Overrides superclass' withdraw method
	//	so that you can't go past the overdraft limit.
	@Override
	public void withdraw(double amount){
		if(getBalance()-amount > overdraftLimit*(-1)){
			setBalance(getBalance() - amount);
		}
	}
}
