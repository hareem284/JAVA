/*Introduction to if-else.Check whether a number
 given by the user is greater than 10 or not. If the given number is
//  greater than 10 then print 
// “Yes I’m Greater” otherwise print “Sorry I feel bad”. */

import java.util.Scanner;

class Activity2 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = object.nextInt();
        System.out.println("the integer you entered was " + number);
        if (number > 10) {
            System.out.println("the number is greter then 10");
        } else {
            System.out.println("the number is not greater then 10");
        }

    }
}
