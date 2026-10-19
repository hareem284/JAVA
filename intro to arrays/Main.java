import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        // creating a for loop...
        for (var i = 0; i < 5; i++) {
            System.out.println("please enter a number");
            a[i] = sc.nextInt();
        }
        System.out.println(a);

    }
}