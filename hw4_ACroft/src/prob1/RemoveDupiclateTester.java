// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 4
// Due:		2/24/16

package prob1;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDupiclateTester {
	//data fields
	private static Scanner scan = new Scanner(System.in);

	//main: asks for 10 integers, then returns the list with
	//	duplicates removed.
	public static void main(String[] args) {
		System.out.print("Enter 10 integers: ");
		ArrayList<Integer> scanned = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			scanned.add(scan.nextInt());
		}
		removeDuplicate(scanned);
		System.out.print("The distinct integers are ");
		for(int i: scanned){
			System.out.print(i+" ");
		}
	}

	//removeDuplicate: accepts ArrayList of integers and
	//	returns it without duplicates.
	public static void removeDuplicate(ArrayList<Integer> list){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i: list){
			if(! temp.contains(i)){
				temp.add(i);
			}
		}
		list.clear();
		for(int i: temp){
			list.add(i);
		}
	}
}
