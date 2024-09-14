package Task7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Question4 {
	 public static void main(String[] args) {
	        // Define the file path
	        String filePath = "data.txt"; // Change this to the path of your file

	        // Attempt to read the file and handle potential exceptions
	        try {
	            readFile(filePath);
	        } catch (FileNotFoundException e) {
	            // Handle the case where the file does not exist
	            System.err.println("Error: File not found. " + e.getMessage());
	        } catch (IOException e) {
	            // Handle other IO exceptions (e.g., read errors)
	            System.err.println("Error: An IO error occurred. " + e.getMessage());
	        }
	    }

	    // Method to read the file
	    public static void readFile(String filePath) throws FileNotFoundException, IOException {
	        File file = new File(filePath);
	        // Create a FileReader to read from the file
	        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	            String line;
	            // Read and print each line from the file
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        }
	    }
	}