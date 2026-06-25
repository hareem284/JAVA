//You are given a number n, representing the number of rows.
//  You are given a number m, representing the number of columns.
//  You are given n*m numbers, representing elements of 2d array a.
//  You are required to display the contents of 2d array .

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the number of rows you want?");
        int n = sc.nextInt();
        System.out.println("what is the number of coulmns you want?");
        int m = sc.nextInt();
        // declaring a 2d matrix
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter the data for row " + i + " column " + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}