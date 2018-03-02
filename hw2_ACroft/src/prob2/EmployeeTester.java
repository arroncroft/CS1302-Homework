// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 2
// Due:		2/3/16

package prob2;
import java.util.Scanner;

public class EmployeeTester {
	//variables
	private static Scanner scan = new Scanner(System.in);

	//main method
	public static void main(String[] args) {
		//ask for name and create employee object with that name
		System.out.print("Enter a name: ");
		String name = scan.next();
		Employee employee1 = new Employee(name);

		//ask for hours worked and apply that to employee object
		System.out.print("Enter hours worked (7 values separated by spaces): ");
		for(int i=0; i<7; i++){
			employee1.setHours(i, scan.nextDouble());
		}
		System.out.println(employee1+"\n");

		//ask for day of the week and return the hours worked that day
		System.out.print("Enter a day of the week (0-6): ");
		int day = scan.nextInt();
		System.out.println("Hours worked on day "+day+" is "+employee1.getHours(day));
	}

}
