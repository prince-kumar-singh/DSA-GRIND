package ReverseagivenArray;
import java.util.Scanner;
// PS :You are given an array. The task is to reverse the array and print it. 
// One pointer Approach
public class OnePointerApproach {

    void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverseArray(int arr[],int i){
        
        if(i>=arr.length/2){
           return;
        } else {
            swap(arr, i, arr.length - 1 - i);
            reverseArray(arr, i + 1);
        }

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
        OnePointerApproach reverseObj = new OnePointerApproach();
        reverseObj.reverseArray(arr, 0);
        System.out.println("Reversed array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    
    }
}
