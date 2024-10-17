public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;                  // declaring a variable score and assigning a value of 10000
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver) { // if (gameOver == true) is the same as if (gameOver)
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        
        score = 10000;                      // reassigning the value of score to 10000
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) { // if (gameOver == true) is the same as if (gameOver)
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
