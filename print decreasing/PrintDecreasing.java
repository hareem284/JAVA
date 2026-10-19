
//You are given a positive number n.
// You are required to print the counting from n to 1.
// You are required to not use any loops.
//  Complete the body of print Decreasing function to achieve it.
//  AT THE END OF ACTIVITY ASK STUDENT TO WRITE ITERATIVE SOLUTION ALSO.
import java.util.*;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a positive number: ");
        int n = sc.nextInt();
        // calling the function of decreasing
        decreasenum(n);
    }

    // creating the function decrease num
    public static void decreasenum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        //
        decreasenum(n - 1);
    }

}