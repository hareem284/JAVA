import java.util.*;

public class fibbonaci {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of fibbonaci numbers you want: ");
        int count = sc.nextInt();
        System.out.println(n1 + " " + n2);
        // calling the function print fibbonaci
        printfibbonaci(count - 2);
    }

    static void printfibbonaci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
            printfibbonaci(count - 1);
        }
    }

}
