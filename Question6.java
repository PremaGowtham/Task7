package Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Question6 {

	public static void main(String[] args) {
		
		  // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Populate the TreeMap with employee IDs and names
        employeeMap.put(101, "Smith");
        employeeMap.put(103, "Johnson");
        employeeMap.put(102, "Charlie");
        employeeMap.put(104, "David");

        // Extract names from the TreeMap
        ArrayList<String> namesList = new ArrayList<>(employeeMap.values());
        
        System.out.println("Before sorting" + employeeMap);

        // Sort names in alphabetical order
        Collections.sort(namesList);

        // Print all employee names in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}