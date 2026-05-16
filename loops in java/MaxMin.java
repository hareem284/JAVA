
/*in this activity, you will learn about taking input 
and finding the maximum and minimum of that using a do-while loop.*/
import java.util.Scanner;

class MaxMin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char ch;
        System.out.println("Maximum assigned number by java is = " + max);
        System.out.println("Minimun assigned number by java is = " + min);
        do {
            System.out.print("Enter a number: ");
            int number = scn.nextInt();
            if (number > max) {

                max = number;
                System.out.println("Maximum assigned new one is = " + max);
            }
            if (number < min) {
                min = number;
                System.out.println("Minimun  number by user is = " + min);
            }
            System.out.print("Do you want to continue (y/n)? ");
            ch = scn.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

    }
}