import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        System.out.print("Enter rotation: ");
        int r = input.nextInt();

        String str = Integer.toString(num);
        int len = str.length();

        // Handle rotation bigger than length
        r = r % len;

        // Split and rotate
        String part1 = str.substring(len - r);
        String part2 = str.substring(0, len - r);

        String result = part1 + part2;

        System.out.println("Rotated number: " + result);

        input.close();
    }
}