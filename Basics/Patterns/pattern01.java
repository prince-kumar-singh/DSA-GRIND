import java.util.Scanner;

/*
 * Program: Rectangular Star Pattern
 * File: pattern01.java
 * Example:
 * Input: rows = 3, columns = 5
 * Output:
 * * * * * 
 * * * * * 
 * * * * * 
 */


public class pattern01 {

    // Method to print rectangular star pattern
    static void printRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {         // Loop for rows
            for (int j = 0; j < cols; j++) {     // Loop for columns
                System.out.print("* ");
            }
            System.out.println();                // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Call the method to print the pattern
        printRectangle(rows, cols);

        scanner.close();
    }
}
