package Task7;

import java.util.Scanner;

public class ArrayoutofBoundDemo {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the number of elements
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();  // Read the number of elements

	        // Create an array of the specified size
	        int[] array = new int[n];

	        // Prompt the user to enter the elements of the array
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	           System.out.print("Element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();  // Read each integer input and store it in the array
	        }

        // Display the elements of the array
	        System.out.println("Array contents:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
	        

	try {
		System.out.println(array[7]);
	}
	catch(ArrayIndexOutOfBoundsException Ae)
{
	System.out.println("Array Out Of Bounds");
}
	}
}
	
