// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob1;
import java.util.Date;

public class Account {
	//variables
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	//No-arg constructor
	public Account(){
		dateCreated = new Date();
	}

	//constructor: accepts an id number and initial
	//	balance when creating a new Account.
	public Account(int id, double initialBalance){
		this.id = id;
		balance = initialBalance;
		dateCreated = new Date();
	}

	//getId: returns I.D. number for an account.
	public int getId() {
		return id;
	}

	//setId: sets I.D. number for an account.
	public void setId(int id) {
		this.id = id;
	}

	//getBalance: returns account balance.
	public double getBalance() {
		return balance;
	}

	//setBalance:sets the account balance.
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//getAnnualInterestRate: returns the annual interest
	//	rate.
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	//setAnnualInterestRate: sets the annual interest
	//	rate.
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//getDateCreated: returns date that account was
	//	created.
	public Date getDateCreated(){
		return dateCreated;
	}

	//getMonthlyInterestRate: returns percentage rate
	//	of monthly interest.
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = (annualInterestRate/100) / 12;
		return monthlyInterestRate;
	}

	//getMonthlyInterest: returns dollar amount of
	//	monthly interest.
	public double getMonthlyInterest(){
		double monthlyInterest = balance * getMonthlyInterestRate();
		return monthlyInterest;
	}

	//withdraw: subtracts money from account
	public void withdraw(double amount){
		balance -= amount;
	}

	//deposit: adds money to account
	public void deposit(double amount){
		balance += amount;
	}
}
