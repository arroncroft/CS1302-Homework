// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

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

		//ask for employee type and create an employee object
		//	of that type.
		System.out.print("Enter an employee type (e,h, or s): ");
		String s = scan.next();
		char type = s.charAt(0);
		Employee employee1 = new Employee(name);
		if (type == 'h'){
			employee1 = new HourlyEmployee(name);
		}
		else if (type == 's'){
			employee1 = new SalariedEmployee(name);
		}
		else if (type == 'e'){
			//does nothing
		}
		else {
			System.out.println("Invalid type");
		}

		//ask for hours worked and apply that to employee object
		System.out.print("Enter hours worked (7 values separated by spaces): ");
		for(int i=0; i<7; i++){
			employee1.setHours(i, scan.nextDouble());
		}

		//ask for pay rate
		System.out.print("Enter pay rate ($/hr): ");
		double payRate = scan.nextDouble();

		//print employee toString and total wages
		System.out.println("\n"+employee1);
		System.out.println("Total Wages: $"+employee1.wages(payRate));
	}
}
