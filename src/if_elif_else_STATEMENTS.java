public class if_elif_else_STATEMENTS {
    public static void main (String[] args) {

        boolean gameOver = true;
        int score = 1200;
        int level = 5;
        int newBonus = 500;
        int totalBonus = 0;

        if (gameOver && score > 1500) {
            System.out.println("Score greater than 1500");
            totalBonus += level*200;
        }
        else if (gameOver && score < 1500) {
            System.out.println("Score lower than 1500");
            totalBonus += level*200;

        }

        else {
            System.out.println("Failed");
        }
        System.out.println("Total bonus is "+totalBonus);
        System.out.println("Final score is "+(totalBonus + score));

    }
}
