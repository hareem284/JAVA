import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("whats the number of integers you would like?");
        int n = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the " + n + " integers:");
        for (int i = 0; i < n; i++) {
            al.add(scan.nextInt());
        }

        for (int i = al.size() - 1; i >= 0; i--) {
            int e = al.get(i);

            // Check if 'e' is prime
            if (e > 1) {
                boolean isPrime = true;

                for (int j = 2; j * j <= e; j++) {
                    if (e % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    al.remove(i);
                }
            }
        }

        System.out.println("List after removing prime numbers: " + al);
        scan.close();
    }
}