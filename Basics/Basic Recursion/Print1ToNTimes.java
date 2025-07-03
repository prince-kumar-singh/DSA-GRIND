import java.util.Scanner;

public class Print1ToNTimes {

    public static void print1ToN(int i, int N) {
        if(i>N){
            return;
        } else {
            System.out.print(i + " ");
            print1ToN(i + 1, N);
        }
    }

    public static void print1ToNbyBacktracking(int i, int N) {
        if(i<1){
            return;
        } else {
            print1ToNbyBacktracking(i - 1, N);
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        System.out.println("\nPrinting from 1 to " + n + " by Recursion:");
        print1ToN(1,n);

        System.out.println("\nPrinting from 1 to " + n + " by Backtracking:");
        print1ToNbyBacktracking(n,n);

        scanner.close();
    }
}