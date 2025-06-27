import java.util.Scanner;

/*
 * Program: Right-Angled Number Pyramid
 * File: pattern03.java
 *
 * Example:
 * Input: rows = 5
 * Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

public class pattern03 {

    // Method to print Right-Angled Number Pyramid
    static void printRightAngledNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {           
            for (int j = 1; j <= i; j++) {          
                System.out.print(j);
            }
            System.out.println();                   
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Call method to print the number pyramid pattern
        printRightAngledNumberPyramid(rows);

        scanner.close();
    }
}
