import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner chly = new Scanner(System.in);
        System.out.println("enter an year for e.g 2026");
        int leap = chly.nextInt();
        /*
         * Leap Years are any year that can be exactly divided by 4 (such as 2020, 2024,
         * 2028, etc).
         * not, but if it cannot be exactly divided by 100,
         */
        if (leap % 4 == 0) {
            if (leap % 100 != 0) {
                System.out.println("its a leap year");
            }
        } else if (leap % 400 == 0) {
            System.out.println("its a leap year");
        } else {
            System.out.println("it was not a leap year");
        }
    }
}