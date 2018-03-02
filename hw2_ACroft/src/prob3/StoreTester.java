// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 2
// Due:		2/3/16

package prob3;

public class StoreTester {

	//main: creates test employees to assign to test
	// Store class and its methods.
	public static void main(String[] args) {
		Store store = new Store();
		Employee e = new Employee("Dave");
		for(int i=1; i<6; i++) e.setHours(i, 8);
		store.addEmp(e);

		e = new Employee("Anna");
		e.setHours(6, 10);
		store.addEmp(e);

		e = new Employee("Paul");
		store.addEmp(e);

		System.out.println (store);
		System.out.println (store.getEmp(1));
	}
}
