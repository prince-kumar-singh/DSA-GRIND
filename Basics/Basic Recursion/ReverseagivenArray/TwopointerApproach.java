package ReverseagivenArray;
// PS :You are given an array. The task is to reverse the array and print it. 
// Two pointer Approach
import java.util.Scanner;
public class TwopointerApproach {

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: when start index meets or exceeds end index
        }
        // Swap elements at start and end indices
        swap(arr, start, end);
        
        // Recursive call with updated indices
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TwopointerApproach reverseObj = new TwopointerApproach();
        reverseObj.reverseArray(arr, 0, n - 1);

        System.out.println("Reversed array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
