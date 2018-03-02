// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob2;

public class SalariedEmployee extends Employee {

	//constructor: accepts a name for the employee.
	public SalariedEmployee(String name) {
		super(name);
	}

	//wages: accepts a pay rate per hour and returns
	//	amount of wages earned. Returns time-and-a-half
	//	pay if working on the weekend.
	@Override
	public double wages(double payRate){
		double wages = 0;
		for(int i=0; i<7; i++){
			if(i<5){
				wages += getHours(i)*payRate;
			}
			else{
				wages += getHours(i)*payRate*1.5;
			}
		}
		return wages;
	}
}
