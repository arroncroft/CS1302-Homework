// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 5
// Due:		3/9/16

package prob2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberAdder {
	//main method
	public static void main(String[] args) throws Exception{
		//data fields
		ArrayList<String> allTokens = new ArrayList<String>();
		int sum = 0;
		int skip = 0;
		File inFile = new File("C:\\Users\\Croft\\Documents\\School\\2016 - Spring\\CS 1302\\"+
				"cs1302_homework\\hw5_ACroft\\src\\prob2\\numbers.txt");
		Scanner scan = new Scanner(inFile);

		//adds all scanned items to arrayList
		while(scan.hasNext()){
			allTokens.add(scan.next());
		}
		//goes through scanned items, looking for 's'
		//for each 's', uses the number after to add to skip
		//adds numbers to sum, except when skip is more than 0
		//	else, subtracts 1 from skip value
		for(String token : allTokens){
			if(token.charAt(0) == 's'){
				skip += Integer.parseInt(token.substring(1)) + 1;
			}
			if(skip == 0){
				sum += Integer.parseInt(token);
			}
			else{
				skip--;
			}
		}
		//prints totals of all non-skipped items
		System.out.println("Sum = " + sum);
		scan.close();
	}
}
