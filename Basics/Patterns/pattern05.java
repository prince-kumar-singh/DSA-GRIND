import java.util.Scanner;

/*
 * Program: Inverted Right Pyramid
 * File: pattern05.java
 *
 * Example:
 * Input: rows = 5
 * Output:
 * * * * * *
 * * * * * 
 * * * * 
 * * * 
 * * 
 */

public class pattern05 {

    // Method to print Inverted Right Pyramid pattern
    static void InvertedRightPyramid(int rows) {
        for (int i = 0; i < rows; i++) {          
            for (int j = rows; j >i ; j--) {         
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
        InvertedRightPyramid(rows);

        scanner.close();
    }
}
