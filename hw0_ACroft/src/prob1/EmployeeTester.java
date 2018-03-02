package prob1;

public class EmployeeTester {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = x*y;
		System.out.println(z);
		z = x+y;
		System.out.println(z);
		
		boolean isSame = isLastCharSame("home","base");
		System.out.println(isSame);
	}
	
	public static boolean isLastCharSame(String s1,String s2){
		char e1 = s1.charAt(s1.length()-1);
		char e2 = s2.charAt(s2.length()-1);
		boolean isSame = e1==e2;
		return isSame;
	}

}
