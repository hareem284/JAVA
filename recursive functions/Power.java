//You are given a number x.
// You are given another number n.
// You are required to calculate x raised to the power n.
//  Don't change the signature of power function.
//  This function expects call function to be only log(n) high.

import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base: ");
        int x = sc.nextInt();
        System.out.println("enter the power: ");
        int n = sc.nextInt();
        // calling the function pow
        int p = pow(x, n);
        System.out.println("the result is : " + p);
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;

        }
        return x * pow(x, n - 1);

    }
}
