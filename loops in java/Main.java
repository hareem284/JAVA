/*introduction to loops.
 Print the first 10 natural numbers in descending order 
using for loop and in ascending order using a while loop.*/
class Main {
    public static void main(String[] args) {
        System.out.println("Printing the first 10 numbers in descending order.");
        /* making the for loop */
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        /* ascending order using----while loops */
        int n = 1;
        while (n < 11) {
            System.out.println(n);
            n++;
        }

    }
}