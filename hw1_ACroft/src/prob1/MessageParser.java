// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 1
// Due:		1/25/16

package prob1;
import java.util.Scanner;

public class MessageParser {
	//variables
	private static Scanner scan = new Scanner(System.in);
	
	//main
	public static void main(String[] args) {
		System.out.print("Enter a message:\t");
		String str = scan.nextLine();
		System.out.println(message(str));
	}
	
	//message: accepts a String and returns a substring 
	//	of it, provided it has a '#' symbol followed by
	//	a number, which is the number of letters in the
	//  created substring.
	public static String message(String str){
		String ret = null;
		int d;
		int index = str.indexOf("#");
		if (index != -1){
			char charD = str.charAt(index+1);
			d = Integer.parseInt(new String(charD + ""));
			ret = str.substring(index+2,index+2+d);
		}
		return ret;
	}
}
