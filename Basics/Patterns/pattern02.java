import java.util.Scanner;

/*
 * Program: Right-Angled Triangle Star Pattern
 * File: pattern02.java
 *
 * Example:
 * Input: rows = 4
 * Output:
 * * 
 * * * 
 * * * * 
 * * * * * 
 */

public class pattern02 {

    // Method to print right-angled triangle pattern
    static void printTriangle(int rows) {
        for (int i = 0; i < rows; i++) {          
            for (int j = 0; j <= i; j++) {         
                System.out.print("* ");
            }
            System.out.println();                  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Call method to print the triangle pattern
        printTriangle(rows);

        scanner.close();
    }
}
