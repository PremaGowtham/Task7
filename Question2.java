package Task7;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		
		
     
		
       // Create a Scanner object to read input from the console
       Scanner scan = new Scanner(System.in);
       
       // Prompt the user to enter a string
       System.out.print("Enter a string: ");
       
       // Read the input string from the user
       String str = scan.nextLine();
       
       // Display the input string
       System.out.println("You entered: " + str);
       
       try
       {
    	   System.out.println(str.charAt(20));
       }
       // Catch the exception and display an error message
       catch(Exception e)
       {
    	   System.out.println("String Out of Bound");
       }
       }
       
	}


