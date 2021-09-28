public class methodOVERLOADING {
    public static void main (String[] args) {
        calculateSCORE("Deepak", 500);
        calculateSCORE(500);
        calculateSCORE();
        feetANDINCHES(-1, 5);
        feetANDINCHES(1);  // OVERLOADING IS USED.


        // method overloading is using same method again and again with different parameters.

    }

    public static void calculateSCORE(String name, int score) {
        System.out.println(name+" has scored "+score);
    }

    public static int calculateSCORE(int score) {
        System.out.println("only score: "+score);
        return score;

    }
    public static void calculateSCORE() {
        System.out.println("No name and NO score");
    }

    public static double feetANDINCHES(double feet, double inches) {
        double centimeters = 0;
        if ((feet >= 0) && (inches <= 12) && (inches >= 0)) {
            double inctocm = inches * 2.58;
            double feettocm = feet * 30.5;
            centimeters += inctocm + feettocm;
            System.out.println(centimeters);
            return (centimeters);


        }
        else {
            return -1;
        }





    }

    public static double feetANDINCHES(double inches) {
        if (inches >= 0) {
            System.out.println(inches * 2.58);
            return inches * 2.58;
        }
        else {
            return -1;
        }
    }



}
