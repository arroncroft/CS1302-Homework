// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 1
// Due:		1/25/16

package prob2;
import java.util.Scanner;

public class PasswordChecker {
	//variables
	private static Scanner scan = new Scanner(System.in);
	
	//main
	public static void main(String[] args) {
		System.out.print("Enter a password:\t");
		String password = scan.nextLine();
		System.out.println("isLevel1: " + isLevel1(password));
		System.out.println("isLevel2: " + isLevel2(password));
		System.out.println("passwordLevel: " + passwordLevel(password));
	}
	
	//isLevel1: accepts a String password and returns true
	//	if it meets at least 2 of 3 requirements (One
	//	capital letter, one lowercase letter, or one digit).
	private static boolean isLevel1(String password){
		boolean isLevel1 = false;
		boolean oneCapital = false;
		boolean oneLowercase = false;
		boolean oneDigit = false;
		for (int i=0; i<password.length();i++){
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') 
				oneCapital = true; 
			else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') 
				oneLowercase = true; 
			else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') 
				oneDigit = true;
		}
		if(oneCapital && (oneLowercase || oneDigit) || (oneLowercase && oneDigit)){
			isLevel1 = true;
		}
		return isLevel1;
	}
	
	//isLevel2: accepts a String password and returns true
	//	if it meets all 3 requirements (One capital
	//	letter, one lowercase letter, or one digit).
	private static boolean isLevel2(String password){
		boolean isLevel2 = false;
		boolean oneCapital = false;
		boolean oneLowercase = false;
		boolean oneDigit = false;
		for (int i=0; i<password.length();i++){
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') 
				oneCapital = true; 
			else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') 
				oneLowercase = true; 
			else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') 
				oneDigit = true;
		}
		if(oneCapital && oneLowercase && oneDigit){
			isLevel2 = true;
		}
		return isLevel2;
	}
	
	//passwordLevel: accepts a String password and returns an
	//	int, which is the level of the password (1, 2, or 0 
	//	if it's neither).
	private static int passwordLevel(String password){
		int level = 0;
		if(isLevel1(password) && isLevel2(password) == false)
			level = 1;
		else if (isLevel1(password) && isLevel2(password))
			level = 2;
		return level;
	}
}
