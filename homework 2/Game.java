public class Game {

    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    /** Postcondition: All instance variables have been initialized. */
    public Game() {
        /* implementation not shown */
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus() {
        /* implementation not shown */
        return false;
    }

    /**
     * Simulates the play of this Game (consisting of three levels)
     * and updates all relevant game data
     */
    public void play() {
        /* implementation not shown */
    }

    /** Returns the score earned in the most recently played game. */
    public int getScore() {
        int score = 0;

        // Add Level 1 points if goal is reached
        if (levelOne.goalReached()) {
            score += levelOne.getPoints();

            // Add Level 2 points if both Level 1 and Level 2 goals are reached
            if (levelTwo.goalReached()) {
                score += levelTwo.getPoints();

                // Add Level 3 points if all three goals are reached
                if (levelThree.goalReached()) {
                    score += levelThree.getPoints();
                }
            }
        }

        // Triple the score if it is a bonus game
        if (isBonus()) {
            score *= 3;
        }

        return score;
    }

    /**
     * Simulates the play of num games and returns the highest score earned.
     * Precondition: num > 0
     */
    public int playManyTimes(int num) {
        int highestScore = 0;

        for (int i = 0; i < num; i++) {
            play(); // Simulate one game
            int score = getScore(); // Get the score for that game

            if (score > highestScore) {
                highestScore = score;
            }
        }

        return highestScore;
    }

    // There may be instance variables, constructors,
    // and methods that are not shown.
}