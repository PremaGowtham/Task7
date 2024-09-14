package Task7;

import java.util.ArrayList;

public class Question5 {

		
		 public static void main(String[] args) {
		        // Create an ArrayList of Strings
		        ArrayList<String> stringList = new ArrayList<>();

		        // Add elements to the ArrayList
		        stringList.add("Apple");
		        stringList.add("Banana");
		        stringList.add("Cherry");
		        stringList.add("Date");
		        stringList.add("Elderberry");

		        // Display the contents of the ArrayList
		        System.out.println("ArrayList before removal:");
		        for (String item : stringList) {
		            System.out.println(item);
		        }

		        // Remove all elements from the ArrayList
		        stringList.clear();

		        // Display the contents of the ArrayList after removal
		        System.out.println("\nArrayList after removal:");
		        if (stringList.isEmpty()) {
		            System.out.println("The ArrayList is now empty.");
		        } else {
		            for (String item : stringList) {
		                System.out.println(item);
		            }
		        }
		    }
		}