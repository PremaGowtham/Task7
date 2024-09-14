package Task7;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		
	
		        // Create a List of Strings
		        List<String> list = new ArrayList<>();
		        list.add("Apple");
		        list.add("Banana");
		        list.add("Cherry");
		        list.add("Date");

		        // Convert List to an Array
		        // Method 1: Using the toArray() method
		        String[] array1 = list.toArray(new String[0]);

		        // Print the array
		        System.out.println("Array using toArray(new String[0]):");
		        for (String fruit : array1) {
		            System.out.println(fruit);
		        }

		        // Method 2: Using a loop to manually copy elements (if needed)
		        String[] array2 = new String[list.size()];
		        for (int i = 0; i < list.size(); i++) {
		            array2[i] = list.get(i);
		        }

		        // Print the array
		        System.out.println("\nArray using manual copying:");
		        for (String fruit : array2) {
		            System.out.println(fruit);
		        }
		    }
		}
