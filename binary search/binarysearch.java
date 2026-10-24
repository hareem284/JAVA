
import java.util.*;

public class binarysearch {

    // Defining the function
    public static int binaryhunt(int arr[], int se) {
        int l = 0;
        int h = arr.length - 1;

        // Using the while loop
        while (l <= h) {

            // Finding the middle index
            int m = l + (h - l) / 2;
            System.out.println("Middle index: " + m);

            if (arr[m] == se) {
                return m;
            }

            // If se is greater, ignore left half
            if (arr[m] < se) {
                l = m + 1;
            }

            // If se is smaller, ignore right half
            else {
                h = m - 1;
            }
        }

        // Element not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("How many elements in the array?");
        int n = scn.nextInt();

        // Making the array
        int arr[] = new int[n];

        System.out.println(
                "Enter the elements in ascending order:");

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(
                "Which element do you want to search?");
        int se = scn.nextInt();

        // Calling the binary search function
        int result = binaryhunt(arr, se);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(
                    "The element has been found at index " + result);
        }

        scn.close();
    }
}
