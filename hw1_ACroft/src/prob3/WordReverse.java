// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 1
// Due:		1/25/16

package prob3;
import java.util.Scanner;

public class WordReverse {
	//variables
	private static Scanner scan = new Scanner(System.in);
	
	//main
	public static void main(String[] args) {
		System.out.print("Enter a sentence:\t");
		String sentence = scan.nextLine();
		System.out.println(reverseSentence(sentence));
	}
	
	//reverseSentence: accepts a String sentence and displays
	//	it backwards.
	private static String reverseSentence(String sentence){
		String ret = "";
		for (int i=sentence.length()-1;i>=0;i--){
			System.out.print(sentence.charAt(i));
		}
		return ret;
	}
}
