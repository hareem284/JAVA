import java.util.Scanner;

class MAIN {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        try {
            System.out.println("enter 2 numbers");
            int x = s1.nextInt();
            int y = s1.nextInt();
            int division = x / y;
            System.out.println("the answer is: " + division);
        } catch (ArithmeticException a) {
            System.out.println("the error has been caught :" + a);
        } finally {
            System.out.println("everything has worked!!!");
            s1.close();
        }

    }
}