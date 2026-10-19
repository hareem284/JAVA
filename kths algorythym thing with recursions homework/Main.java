//i made this a bit different than usual cuz i forgot a bit so i needed some refrence

public class Main {

    static int count = 0;
    static String answer = "";

    // Recursive method to generate permutations
    public static void findPermutation(String current, String remaining, int k) {

        // Base case
        if (remaining.length() == 0) {
            count++;

            if (count == k) {
                answer = current;
            }

            return;
        }

        // Recursive case
        for (int i = 0; i < remaining.length(); i++) {

            char chosen = remaining.charAt(i);

            String newRemaining = remaining.substring(0, i)
                    + remaining.substring(i + 1);

            findPermutation(current + chosen, newRemaining, k);

            // Stop once the kth permutation is found
            if (!answer.equals("")) {
                return;
            }
        }
    }

    // Given n and k, return the kth permutation sequence
    public static String getPermutation(int n, int k) {

        count = 0;
        answer = "";

        String numbers = "";

        for (int i = 1; i <= n; i++) {
            numbers += i;
        }

        findPermutation("", numbers, k);

        return answer;
    }

    public static void main(String[] args) {

        int n = 3;
        int k = 4;

        System.out.println(getPermutation(n, k));
    }
}