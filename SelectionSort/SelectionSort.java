import java.util.*;

public class SelectionSort {
    // declaring the function slectionsort
    public static void selectionsort(int[] arr, int n) {
        // the i for loop tracks poition from beginning
        for (int i = 0; i < n - 1; i++) {
            // am assuming that the minimum in the beginning is i
            int min_index = i;
            // making another for loop inside a for loop
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Sorting " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of elements :");
        int n = scn.nextInt();

        System.out.println(" enter the elements: ");
        int[] arr = new int[n];
        // creating the for loop
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // calling the function selectionsort
        selectionsort(arr, n);

    }
}