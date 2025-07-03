import java.util.Scanner;

public class PrintNTo1Times {
    
    void printNto1(int i) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        printNto1(i - 1);
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        PrintNTo1Times obj = new PrintNTo1Times();
        System.out.println("\nPrinting from " + n + " down to 1:");
        obj.printNto1(n);
        scanner.close();
    }
}
