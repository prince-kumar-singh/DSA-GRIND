import java.util.Scanner;

/*
 * Program:  Star Pyramid
 * File: pattern07.java
 *
 * Example:
 * Input: rows = 5
 * Output:
 *      *     
 *     ***    
 *    *****   
 *   *******  
 *  ********* 
 */
public class pattern07 {
    void StarPyramid(int rows) {
        for (int i = 0; i < rows; i++) { 
            // Print leading spaces         
            for (int j = 1; j <= rows - i+1; j++) {         
                System.out.print(" ");
            }
            // Print stars 
            for (int j = 1; j <= 2 * i + 1; j++) {         
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();                  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Create an instance of the class to call the method
        pattern07 pattern = new pattern07();

        // Call method to print the inverted numbered right pyramid pattern
        pattern.StarPyramid(rows);

        scanner.close();
    } 
}
