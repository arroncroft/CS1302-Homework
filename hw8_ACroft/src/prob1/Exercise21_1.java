// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 8
// Due:		4/25/16
package prob1;

import java.util.*;

public class Exercise21_1 {
	public static void main(String[] args){
		//create, populate, and print HashSets
		HashSet<String> names1 = new HashSet<String>();
		names1.add("George");
		names1.add("Jim");
		names1.add("John");
		names1.add("Blake");
		names1.add("Kevin");
		names1.add("Michael");

		HashSet<String> names2 = new HashSet<String>();
		names2.add("George");
		names2.add("Katie");
		names2.add("Kevin");
		names2.add("Michelle");
		names2.add("Ryan");

		System.out.print("Original Set 1: ");
	    System.out.println(names1);
	    System.out.print("Original Set 2: ");
	    System.out.println(names2);

	    //find and print union of the two sets
	    HashSet<String> names1Clone1 = (HashSet<String>)names1.clone();
	    names1Clone1.addAll(names2);
	    System.out.print("Union of the two sets: ");
	    System.out.println(names1Clone1);

	    //find and print difference of the two sets
	    HashSet<String> names1Clone2 = (HashSet<String>)names1.clone();
	    names1Clone2.removeAll(names2);
	    System.out.print("Difference of the two sets: ");
	    System.out.println(names1Clone2);

	    //find and print intersection of the two sets
	    HashSet<String> names1Clone3 = (HashSet<String>)names1.clone();
	    names1Clone3.retainAll(names2);
	    System.out.print("Intersection of the two sets: ");
	    System.out.println(names1Clone3);
	}
}

