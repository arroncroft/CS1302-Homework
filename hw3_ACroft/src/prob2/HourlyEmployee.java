// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob2;

public class HourlyEmployee extends Employee {

	//constructor: accepts a name for the employee.
	public HourlyEmployee(String name) {
		super(name);
	}

	//wages: accepts a pay rate per hour and returns
	//	amount of wages earned. Returns time-and-a-half
	//	pay if working over 40 hours.
	@Override
	public double wages(double payRate){
		if(totalHours() <= 40){
			return totalHours()*payRate;
		}
		else {
			return (40*payRate) + ((totalHours()-40)*payRate*1.5);
		}
	}
}
