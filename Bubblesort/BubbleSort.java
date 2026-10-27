import java.util.*;

public class BubbleSort {
    // declaring the function bubblesort : i=outerloop, j=inerloop
    static void bubblesort(int[] arr, int n) {
        // declaring variables
        int i, j, temp;
        boolean swap;
        // starting the outerloop to tranverse through all the elements
        for (i = 0; i < n - 1; i++) {
            swap = false;
            System.out.println("SORTING TRY " + i);
            for (j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = scn.nextInt();
        // making the array
        int[] arr = new int[n];
        //
        System.out.println("enter the elements");

        // creating a for loop
        for (int i = 0; i < n; i++) {
            System.out.println("enter the elements at position " + i);
            arr[i] = scn.nextInt();
        }
        // calling the bubble sort method
        bubblesort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
