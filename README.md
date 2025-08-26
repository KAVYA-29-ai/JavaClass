# JavaClass
MYOPPS WITH JAVA CONCEPT

import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args) {
        
        // Task 1: Create a jagged array with 3 rows of different lengths.
        // The outer array has 3 rows.
        int[][] jaggedArray = new int[3][];
        
        // Initialize each row with a different number of columns.
        jaggedArray[0] = new int[2]; // Row 1 has 2 elements
        jaggedArray[1] = new int[4]; // Row 2 has 4 elements
        jaggedArray[2] = new int[3]; // Row 3 has 3 elements
        
        // Task 2: Fill the array with sequential numbers.
        int number = 1;
        // Outer loop for rows
        for (int i = 0; i < jaggedArray.length; i++) {
            // Inner loop for columns in the current row
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = number;
                number++;
            }
        }
        
        // Task 3: Print it row by row using Arrays.toString().
        System.out.println("Printing the jagged array row by row:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Row " + i + ": " + Arrays.toString(jaggedArray[i]));
        }
        
        System.out.println("\n--------------------------------\n");
        
        // Challenge: Print in a neatly formatted matrix form.
        System.out.println("Printing the jagged array in matrix form:");
        // Outer loop for rows
        for (int i = 0; i < jaggedArray.length; i++) {
            // Inner loop for columns
            for (int j = 0; j < jaggedArray[i].length; j++) {
                // Print each element followed by a space
                System.out.print(jaggedArray[i][j] + "\t");
            }
            // Move to the next line after each row is printed
            System.out.println(); 
        }
    }
}

 
