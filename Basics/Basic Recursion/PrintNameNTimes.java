import java.util.Scanner;

// Print Name N times using Recursion

public class PrintNameNTimes {

    public static void printName(String name, int n) {
        if (n <= 0) {
            return; // Base case: if n is 0 or negative, stop recursion
        }
        System.out.println(name); // Print the name
        printName(name, n - 1); // Recursive call with n decremented by 1
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for name and number of times
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of times to print your name: ");
        int n = scanner.nextInt();

        // Call the static method to print the name n times
        printName(name, n);

        scanner.close();
    }
}
