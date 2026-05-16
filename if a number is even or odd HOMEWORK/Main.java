import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number and i will tell you if its odd or even");
        int wnumber = number.nextInt();
        if (wnumber % 2 == 0) {
            System.out.println("its an even number");
        } else {
            System.out.println("its odd.");
        }
    }
}