public class WordMatch {
    /** The secret string. */
    private String secret;

    /** Constructing a WordMatch object with the given secret string. */
    public WordMatch(String word) {
        secret = word;
    }

    /**
     * Returning a score for guess.
     */
    public int scoreGuess(String guess) {
        int count = 0;

        // Check every possible position in the secret string
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            // Get a substring with the same length as guess
            String part = secret.substring(i, i + guess.length());

            // Check if the substring matches the guess
            if (part.equals(guess)) {
                count++;
            }
        }

        // Score = number of occurrences × square of guess length
        return count * guess.length() * guess.length();
    }

    /**
     * Returns the better of two guesses.
     */
    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        // Return the guess with the higher score
        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            // If scores are equal, return alphabetically greater guess
            if (guess1.compareTo(guess2) > 0) {
                return guess1;
            } else {
                return guess2;
            }
        }
    }
}