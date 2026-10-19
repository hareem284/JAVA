
//1. You are given a number n, 
// representing the size of array a. 2.
//  You are given n numbers, representing elements of array a. 3.
//  You are required to print the elements of array from end to beginning each in a separate line. 
// AT THE END OF ACTIVITY ASK STUDENT TO WRITE ITERATIVE SOLUTION ALSO.
import java.util.*;

public class displayreverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("type in the number of elements you want: ");
        int n = scn.nextInt();
        // making the array
        int[] arr = new int[n];
        // creating the for loop
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        // calling the recursive function
        reverse(arr, n - 1);
    }

    public static void reverse(int[] arr, int idx) {
        if (idx < 0) {
            return;
        }
        System.out.println(arr[idx]);
        reverse(arr, idx - 1);
    }
}