import java.util.Scanner;

// Parent Class
class Addition {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

// Child Class 1
class Subtraction extends Addition {

    void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

// Child Class 2
class Multiplication extends Subtraction {

    void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }
}

// Lowest Child Class
class Division extends Multiplication {

    void divide(int a, int b) {
        System.out.println("Division = " + (a / b));
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object of the lowest child class
        Division obj = new Division();

        System.out.println("Calculator Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Switch case to select operation
        switch (choice) {

            case 1:
                // Calls method from Addition class
                obj.add(a, b);
                break;

            case 2:
                // Calls method from Subtraction class
                obj.subtract(a, b);
                break;

            case 3:
                // Calls method from Multiplication class
                obj.multiply(a, b);
                break;

            case 4:
                // Calls method from Division class
                obj.divide(a, b);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}