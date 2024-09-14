package Task7;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter their age
		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();

		        try {
		            // Validate the age
		            validateAge(age);
		            System.out.println("Your age is " + age + ". You are eligible.");
		        } catch (InvalidAgeException e) {
		            // Handle the custom exception
		            System.err.println("Error: " + e.getMessage());
		        } finally {
		            // Close the scanner
		            scanner.close();
		        }
		    }

		    // Method to validate age and throw exception if invalid
		    public static void validateAge(int age) throws InvalidAgeException {
		        if (age < 18) {
		            throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
		        }
		    }
		    
	}

