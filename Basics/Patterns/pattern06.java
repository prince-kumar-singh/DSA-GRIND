import java.util.Scanner;

/*
 * Program:  Inverted Numbered Right Pyramid
 * File: pattern06.java
 *
 * Example:
 * Input: rows = 5
 * Output:
 * 12345
 * 1234
 * 123  
 * 12 
 * 1  
 */

public class pattern06 {

    void InvertedNumberedRightPyramid(int rows) {
        for (int i = 0; i < rows; i++) {          
            for (int j = 1; j <= rows - i; j++) {         
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

        // Create an instance of the class to call the method
        pattern06 pattern = new pattern06();

        // Call method to print the inverted numbered right pyramid pattern
        pattern.InvertedNumberedRightPyramid(rows);

        scanner.close();
    }
}

