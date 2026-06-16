
//You are given a number n, representing the size of array a.
// You are given n distinct numbers, representing elements of array a.
//  You are given another number d.You are required to check if d number exists in the array
//  a and at what index (0 based). If found print the index, otherwise print -1.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[5];
        for (var i = 0; i < 5; i++) {
            a[i] = scn.nextInt();

        }
        System.out.println("enter the number you want to check which exists on the array:");
        int n = scn.nextInt();
        int check = find(a, n);
        System.out.println("checking " + check);
    }

    public static int find(int[] a, int n) {
        for (var i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }
}