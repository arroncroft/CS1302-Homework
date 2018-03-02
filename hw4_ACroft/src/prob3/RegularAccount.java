// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 4
// Due:		2/24/16

package prob3;

public class RegularAccount extends Account {
	//constructor
	public RegularAccount(double balance){
		super(balance);
	}

	//applyInterest: applies 1% interest to everything
	//	over $1000.
	public void applyInterest(){
		if (balance > 1000){
			balance = balance + ((balance - 1000) * (0.01));
		}
	}
}
