/*Introduction to nested loops. For each input value of n,
 print "prime" if the number is prime and "not prime" otherwise. */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scn.nextInt();
        if (number < 2) {
            System.out.println("not a prime number");
            return;
        }
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        if (prime == true) {
            System.out.println("its a prime number");

        } else {
            System.out.println("its not a prime number");
        }

    }
}