import java.util.*;

public class QuickSort {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // defining the partition function
    static int partition(int[] arr, int low, int high) {
        // pivot is the last element, It means we choose the LAST element as our pivot.
        int pivot = arr[high];
        // Think of j as a person checking numbers and i as a marker showing where
        // smaller numbers should go.
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // defining the function
    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            // Recursively sort elements before and after partition
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = scn.nextInt();
        System.out.println("enter the elements");
        int arr[] = new int[n];
        // running loop
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        quicksort(arr, 0, n - 1);
        System.out.println("*******************the sorted array is ******************");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}