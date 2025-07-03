public class FactorialOfN {
    void factorial(int n, int result) {
        if(n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        if (n == 0 || n == 1) {
            System.out.println("Factorial: " + result);
            return;
        } else {
            factorial(n - 1, result * n);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        FactorialOfN obj = new FactorialOfN();
        System.out.println("Calculating factorial of " + n + ":");
        obj.factorial(n, 1); // Start with result as 1
        scanner.close();
    }
}
