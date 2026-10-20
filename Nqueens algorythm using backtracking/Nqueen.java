import java.util.*;

public class Nqueen {

    // cl[] Which rows already have queens
    // Ld[] Which diagonals in one direction are occupied
    // Rd[] Which diagonals in the other direction are occupied
    static int[] ld = new int[30];
    static int[] rd = new int[30];
    static int[] cl = new int[30];

    static int N = 4;

    // defining printsolution
    static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }

    // solve means find a solution.
    // NQ means N-Queens.
    // util is commonly used in method names to mean a helper or utility method.
    // board is the chessboard.
    // col is the column currently being filled.
    // boolean means the method returns either true or false.
    static boolean solveNQuitil(int[][] board, int col) {
        if (col >= N)
            return true;
        else {
            for (int i = 0; i < N; i++) {
                // Check if it's safe to place queen at (i, col)
                if (ld[i - col + N - 1] != 1 && rd[i + col] != 1 && cl[i] != 1) {

                    // Place queen
                    board[i][col] = 1;
                    ld[i - col + N - 1] = 1;
                    rd[i + col] = 1;
                    cl[i] = 1;
                    // Recur
                    if (solveNQuitil(board, col + 1))
                        return true;

                    // Backtrack
                    board[i][col] = 0;
                    ld[i - col + N - 1] = 0;
                    rd[i + col] = 0;
                    cl[i] = 0;

                }
            }
            return false;
        }
    }

    // definning function
    static boolean solveNQ() {
        // N = 4 means four rows and four columns.
        // int[][] means a two-dimensional array, like a table.
        // 0 means an empty square.
        // 1 means a queen is placed there.
        int[][] board = new int[N][N]; // start with all 0s

        if (!solveNQuitil(board, 0)) {
            System.out.println("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String[] args) {
        solveNQ();
    }

}