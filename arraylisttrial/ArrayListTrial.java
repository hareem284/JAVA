import java.util.ArrayList;
import java.util.Scanner;

//creating the main class
class ArrayListTrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of arrays you would like to input:");
        int n = sc.nextInt();
        // creating a 2d arraylist that can hold multiple arraylists.
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        //
        for (int i = 0; i < n; i++) {
            // asking the user how many elements are in each array
            System.out.println("how many elemets are there in array number" + (i + 1));
            int A1 = sc.nextInt();
            // creating the A1 elements
            // creating a new array list to store the A1 elements
            ArrayList<Integer> L2 = new ArrayList<>();
            System.out.println("input the elements ");
            for (int j = 0; j < A1; j++) {
                L2.add(sc.nextInt());
            }
            al.add(i, L2);

        }
        System.out.println(al);
        // starting part 2
        // prompting users to input the number of queries
        System.out.println("enter the number of queries to process:");
        int num = sc.nextInt();
        // starting the for loop
        for (int k = 0; k < num; k++) {
            System.out.println("enter the row for query number " + (k + 1));
            int r = sc.nextInt();
            System.out.println("enter the column for query number " + (k + 1));
            int c = sc.nextInt();
            // putting a try block just incase for any errors
            try {
                // Trying to print the element at the specified row and column
                // row is the array number and c is the position of the element in that array
                System.out.println("Element at (" + r + ", " + c + "): " + al.get(r - 1).get(c - 1));
            } catch (Exception e) {
                // If an exception occurs (index out of bounds), print ERROR
                System.out.println("ERROR!");
            }
        }

    }
}