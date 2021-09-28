public class methods {
//    public static void calculateScore(boolean gameOver, int score, int level, int bonus) {
//        if (gameOver) {
//            System.out.println("Your final score is "+((bonus*level)+score));
//        }
//
//    }
    // above is a method(function) defined to calculate score. There are some parameters

    public static int calculateScore(boolean gameOver, int score, int level, int bonus) {
        if (gameOver) {
            return ((bonus*level)+score);
        }
        return -1;
    // this method return an int(final score) or -1 if gameover is false;

    }

    public static void calculatePosiont(String name, int position) {  // void = return nothing
        System.out.println(name + " managed to get "+ position);
    }


    public static void main (String[] args) {
        System.out.println(calculateScore(true, 3000, 5, 200));

        // args given to the method
        // java is very similar to python.

        calculatePosiont("Deepak", 5);
    }
}
