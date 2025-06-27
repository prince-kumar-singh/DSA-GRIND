import java.util.Scanner;

/*
 * Program: Right-Angled Number Pyramid-2
 * File: pattern04.java
 *
 * Example:
 * Input: rows = 5
 * Output:
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */

public class pattern04 {

    // Method to print Right-Angled Number Pyramid-2
    static void printRightAngledNumberPyramid2(int rows) {
        for (int i = 1; i <= rows; i++) {           
            for (int j = 1; j <= i; j++) {          
                System.out.print(i);
            }
            
            System.out.println();                   
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Call method to print the number pyramid pattern-2
        printRightAngledNumberPyramid2(rows);

        scanner.close();
    }
}
