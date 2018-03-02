// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 2
// Due:		2/3/16

package prob2;

public class Employee {
	//variables
	private String name;
	private double[] hours = new double[7];

	//constructor: accepts a name, which sets
	//	the employee object's name.
	public Employee(String name){
		this.name = name;
	}

	//getHours: accepts a day and returns hours
	//	worked on that day.
	public double getHours(int day) {
		return hours[day];
	}

	//setHours: allows user to set hours worked for each
	//	day of the week.
	public void setHours(int day, double hours) {
		if(day >= 0 && day <= 6){
			this.hours[day] = hours;
		}
	}

	//numDaysWorked: returns the number of days with
	//	hours worked.
	public int numDaysWorked(){
		int daysWorked = 0;
		for(int i=0; i<hours.length; i++){
			if(hours[i] != 0){
				daysWorked++;
			}
		}
		return daysWorked;
	}

	//totalHours: returns the number of hours worked
	//	in a week.
	public double totalHours(){
		double totalHours = 0;
		for(int i=0; i<hours.length; i++){
			totalHours += hours[i];
		}
		return totalHours;
	}

	//toString: returns a String that lets the user know
	//	the name, number of days worked, and total hours
	//	the employee has worked.
	public String toString(){
		return name + " worked for " + numDaysWorked() +
					  " day(s) for a total of " + totalHours() +
					  " hours.";
	}
}
