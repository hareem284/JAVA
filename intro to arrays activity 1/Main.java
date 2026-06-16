//You are given a number n, representing the count of elements.
//  You are given n numbers.You are required to find the span of input.
//  Span is defined as difference of maximum value and minimum value.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // elements in array
        System.out.println("how many elements do you want in the array??");
        int n = scn.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // creating for loop
        for (var i = 0; i < n; i++) {
            System.out.println("enter the number");
            int x = scn.nextInt();
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("maximum is " + max + "and the minimum is " + min);
        int span = max - min;
        System.out.println("the span is " + span);
    }
}