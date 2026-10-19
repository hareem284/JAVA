//1. You are given a number n, 
// representing the size of array a. 2.
//  You are given n numbers, representing elements of array a. 3. 
// You are required to print the elements of array from beginning to end each in a separate line. 
// AT THE END OF ACTIVITY ASK STUDENT TO WRITE ITERATIVE SOLUTION ALSO.

import java.util.*;

class displayarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // asking the user to enter
        System.out.println("enter the " + n + "elements of the array");
        // creating a for loop
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayArr(arr, 0);

    }

    // making the method
    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println("array " + arr[idx]);
        // calling the function displayarray
        displayArr(arr, idx + 1);
    }
}