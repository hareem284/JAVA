public class Main {

    public static void pzz(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        // First recursive call
        pzz(n - 1);

        System.out.print(n + " ");

        // Second recursive call
        pzz(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        pzz(3);
    }
}