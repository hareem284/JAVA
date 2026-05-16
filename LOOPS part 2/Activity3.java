
/*in this activity,you will apply knowledge taken from in class 
question to print all prime numbers of a defined range.*/
import java.util.Scanner;

class Activity3 {
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        System.out.println(
                "tell me till where i should print out prime numbers here tell me the lower range(where to begin from)");
        int lower = scn.nextInt();
        System.out.println("here tell me the highere range(where shoud  i end)");
        int higher = scn.nextInt();
        /* creating the for loop */

        for (int i = lower; i <= higher; i++) {
            /* checking if 'i' is a prime number */
            if (i < 2) {
                continue;
            }
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }

    }
}
