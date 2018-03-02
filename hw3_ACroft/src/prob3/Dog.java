// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob3;

public class Dog {
	//variables
	private int age;
	private String name;

	//constructors: each one calls the one below
	//	it, down to the fourth one.
	public Dog(){
		this(0,"d0");
	}

	public Dog(int age){
		this(age,"d1");
	}

	public Dog(String name){
		this(1,name);
	}

	public Dog(int age, String name){
		this.age = age;
		this.name = name;
	}

	//getAge: returns age.
	public int getAge(){
		return age;
	}

	//getName: returns name.
	public String getName(){
		return name;
	}

	//toString: returns Dog's name and age.
	public String toString(){
		return "Dog-name: "+name+", Age: "+age;
	}
}
