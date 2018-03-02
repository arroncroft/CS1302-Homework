package prob2;

import java.util.*;

public class BinarySearchTester {
	public static void main(String[] args) {
		Person p;
		int index;

		Person[] persons = { new Customer("Victor", "Chen"), new Employee("Zane", "Mathis", 38),
				new Employee("Kirk", "Long", 33), new Employee("Abe", "Gibson", 22), new Customer("Ralph", "Barnes") };

		System.out.println("Original list:" + Arrays.toString(persons));
		Arrays.sort(persons);
		System.out.println("Sorted list  :" + Arrays.toString(persons));

		// Test Case 1
		p = new Customer("Victor", "Chen");
		index = binarySearch(persons, p);
		displayResults(persons, p, index);

		// Test Case 2
		p = new Employee("Dirk", "Jergen", 77);
		index = binarySearch(persons, p);
		displayResults(persons, p, index);

		// Test Case 3
		p = new Customer("Arden", "Megan");
		index = binarySearch(persons, p);
		displayResults(persons, p, index);

		// Test Case 4
		p = new Employee("Roberts", "Ann", 33);
		index = binarySearch(persons, p);
		displayResults(persons, p, index);
	}

	public static int binarySearch(Person[] persons, Person key) {
		//wip
	}

	private static int binarySearch( Person[] persons, Person key, int low, int high ) {
	   	if (low > high)
	   		return -(low+1);
	   	else 
	   		int mid = (low+high)/2;
	   		if (key < vals[mid])
	   			return binarySearch(vals,key,low,mid-1);
	   		else if (key > vals[mid])
	   			return binarySearch(vals,key,mid+1,high);
	   		else
	   			return mid;
   }

	public static void displayResults(Person[] persons, Person p, int index) {
		System.out.println("***Search Results:");
		System.out.println("Searching for Person=" + p + ", binary search index=" + index);

		if (index >= 0) // found item
			System.out.println("--found person:" + persons[index] + " in pos: " + index);
		else // didn't find item
		{
			// Find index of first item bigger than key
			index = -1 * index - 1;

			if (index < persons.length)
				System.out.println("--not found, next person after: " + persons[index] + " in pos: " + index);
			else
				// If index is bigger then size of list,
				// then key is bigger than largest item.
				System.out.println("--not found, person after all items in list");
		}
		System.out.println();
	}
}

abstract class Person implements Comparable<Person> {
	private String firstName, lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int compareTo(Person p) {
		int compare = getLastName().compareTo(p.getLastName());
		if (compare == 0)
		    compare = getFirstName().compareTo(s.getFirstName());
		return compare;
	}

	public String toString() {
		return firstName + " " + lastName;
	}
}

class Customer extends Person {
	public Customer(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public String toString() {
		return "Customer: " + super.toString();
	}
}

class Employee extends Person {
	private int years;

	public Employee(String firstName, String lastName, int years) {
		super(firstName, lastName);
		this.years = years;
	}

	public String toString() {
		return "Employee: " + super.toString() + ", years=" + years;
	}
}
