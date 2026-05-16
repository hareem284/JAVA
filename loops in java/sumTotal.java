
/*In this activity,
 find the sum of the first N numbers
  while the user gives N as input.*/
import java.util.Scanner;

class sumTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("the sum of the first n number is " + sum);
    }
}