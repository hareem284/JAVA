import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter movie rating count: ");
        int rating = input.nextInt();

        if (rating > 75000) {
            System.out.println("Out of the world");
        } else if (rating > 45000 && rating < 70000) {
            System.out.println("Best");
        } else if (rating > 25000) {
            System.out.println("Better");
        } else if (rating > 5000) {
            System.out.println("Good");
        } else {
            System.out.println("Average or below");
        }

        input.close();
    }
}