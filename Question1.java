package Task7;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {


Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for a:");
		int a = scan.nextInt();
		
		System.out.println("Enter value for b:");
		int b = scan.nextInt();
		
		System.out.println("ArithmeticException");
		try {
			
			System.out.println(a/b);
		}
		catch(ArithmeticException ae) {
         ae.printStackTrace();
	}

	}

}
