// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 2
// Due:		2/3/16

package prob3;

public class Store {
	//variables
	private Employee[] emps = new Employee[20];
	private int numEmps;

	//Store: no-arg constructor
	public Store(){
	}

	//getNumEmps: return number of Employees.
	public int getNumEmps(){
		return numEmps;
	}

	//getEmp: accepts an integer and returns
	//	employee at that position in the array.
	public Employee getEmp(int i){
		Employee employee = emps[i];
		return employee;
	}

	//addEmp: adds employee to an array, emps.
	public void addEmp(Employee e){
		emps[numEmps] = e;
		numEmps++;
	}

	//totalHours: returns number of hours worked
	//	by all employees.
	public double totalHours(){
		double totalHours = 0;
		for(int i=0; i<numEmps; i++){
			totalHours += emps[i].totalHours();
		}
		return totalHours;
	}

	//toString: Returns String with number of employees,
	//	each employee's toString with their data, and
	//	the total hours worked by all employees.
	public String toString(){
		String ret = "Num Employees: "+numEmps+"\n";
			   for(int i=0; i<numEmps; i++){
				   ret += emps[i] + "\n";
			   }
			   ret += "Total hours worked: "+totalHours();
		return ret;
	}
}
