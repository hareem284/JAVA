
//You are given a number n. 
// You are required to calculate the factorial of the number.
//  Don't change the signature of factorial function.
//  AT THE END OF ACTIVITY ASK STUDENT TO WRITE ITERATIVE SOLUTION ALSO.
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number you would like to see the factorial of:");
        int n = sc.nextInt();
        // factorialnum
        // Calling the function

        int result = factorialnum(n);

        System.out.println("Factorial = " + result);
        sc.close();
    }

    // defining the function
    public static int factorialnum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (n * factorialnum(n - 1));
    }
}