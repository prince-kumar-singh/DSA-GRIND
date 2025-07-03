// PS : Print Fibonacci Series up to Nth term
import java.util.Scanner;
public class FibonacciNumber {
    int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        FibonacciNumber fibObj = new FibonacciNumber();
        System.out.println("Fibonacci Series up to " + n + "th term:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibObj.fibonacci(i) + " ");
        }
        sc.close();
    }
}
