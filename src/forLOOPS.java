public class forLOOPS {
    public static void main(String[] args) {
        // for loops
        for (int i = 0; i <= 5; i += 2) {   // 1 - init, 2 - termination, 3 - condition(increment)
            System.out.println(i);
        }
        calculateInterest(10000, 9);
        System.out.println(checkPrime(14));
    }

    public static void calculateInterest(double baseAmount, int n) {
        for (int i = 1; i <= n; i += 1) {
            double interest = ((double) i / 100) * baseAmount;
            System.out.println("Interest at " + i + "% is " + String.format("%.2f", interest));
            // String.format("%.2f",interest) converts it to two decimal places.
        }
        System.out.println();
        for (int i = 9; i >= 1; i -= 1) {
            double interest = ((double) i / 100) * baseAmount;
            System.out.println("Interest at " + i + "% is " + String.format("%.2f", interest));
            // String.format("%.2f",interest) converts it to two decimal places.
        }
    }
    public static boolean checkPrime(int n) {
        if ( n == 1) {
            return false;
        }
        for (int i = 2; i < n; i +=1) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }



}
