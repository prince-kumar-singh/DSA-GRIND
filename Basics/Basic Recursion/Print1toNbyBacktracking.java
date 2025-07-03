import java.util.Scanner;

public class Print1toNbyBacktracking {
    
    void print1toN(int i, int N) {
        if(i<1){
            return;
        } else {
            print1toN(i-1, N);
            System.out.print(i + " "); 
            
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        Print1toNbyBacktracking obj = new Print1toNbyBacktracking();
        System.out.println("\nPrinting from 1 to " + n + ":");
        obj.print1toN(n, n); // Start printing from 1 to N
        scanner.close();
    }
}
