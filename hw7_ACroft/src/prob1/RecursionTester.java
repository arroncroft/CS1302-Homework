// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 7
// Due:		4/6/16

package prob1;

public class RecursionTester {

	//power: recursive method that accepts an x int and n int, and
	//	adds from x to the 0 power up to x to the n power by even
	//	exponents.
	private static int power(int num, int pwr){
		if (pwr%2 == 1)
			pwr--;
		if (pwr == 0)
			return 1;
		return (int) Math.pow(num,pwr) + power(num,pwr-2);
	}
	
	//reverseString: recursive method that accepts an integer
	//	and returns a String of the integer in reverse.
	private static String reverseString(int num){
		if (num/10 == 0)
			return num + "";
		int digit = num%10;
		return digit + reverseString(num/10);
	}
	
	//countOccurrences: 2 overloaded recursive methods that accept a string,
	// 	character, and position number and count the number of instances of 
	//	that character in that string.
	private static int countOccurrences(String str, char key, int pos){
		if (pos >= str.length())
			return 0;
		if (str.charAt(pos) == key)
			return 1 + countOccurrences(str,key,pos+1);
		return countOccurrences(str,key,pos+1);
	}
	private static int countOccurrences(String str, char key){
		return countOccurrences(str,key,0);
	}
	
	//makePalindrome: method that accepts a String and passes it
	//	through reverseString and puts the 2 together to create
	//	a palindrome.
	private static String makePalindrome(String str){
		if (str.length() == 0)
			return "";
		String temp = str.substring(0,1);
		return temp + makePalindrome(str.substring(1,str.length())) + temp;
	}
	
	//main method: tests the above recursive methods
	public static void main(String[] args){
		System.out.println("Test 1a: power(): " + power(2, 3));
		System.out.println("Test 1b: power(): " + power(3, 4));
		System.out.println("Test 1c: power(): " + power(3, 5));
		System.out.println("Test 2a: reverseString(): " + reverseString(6));
		System.out.println("Test 2b: reverseString(): " + reverseString(29));
		System.out.println("Test 2c: reverseString(): " + reverseString(1234567));
		System.out.println("Test 3a: countOccurrences(): " + countOccurrences("z", 'z'));
		System.out.println("Test 3b: countOccurrences(): " + countOccurrences("a", 'z'));
		System.out.println("Test 3c: countOccurrences(): " + countOccurrences("zaz", 'z'));
		System.out.println("Test 3d: countOccurrences(): " + countOccurrences("azazzaaza ab ", 'a'));
		System.out.println("Test 4a: makePalindrome(): " + makePalindrome("a"));
		System.out.println("Test 4b: makePalindrome(): " + makePalindrome("ab"));
		System.out.println("Test 4c: makePalindrome(): " + makePalindrome("abc"));
	}
}
