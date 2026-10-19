import java.util.ArrayList;
import java.util.Scanner;

public class removeprime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of integers you would like to input:");
        int n = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the " + n + " integers:");
        for (int i = 0; i < n; i++) {
            al.add(scan.nextInt());
        }

        // Loop through the list in reverse order
        for (int i = al.size() - 1; i >= 0; i--) {
            int e = al.get(i);

            // Check if 'e' is prime
            if (e > 1) {
                boolean isPrime = true;

                // Check divisors up to square root of e
                for (int j = 2; j * j <= e; j++) {
                    if (e % j == 0) {
                        isPrime = false;
                        break; // Exit early once a factor is found
                    }
                }

                // If the number is prime, remove it from the list
                if (isPrime) {
                    al.remove(i); // Removing by index is cleaner and safer
                }
            }
        }

        System.out.println("List after removing prime numbers: " + al);
        scan.close();
    }
}