public class codingEX1 {

    public static void main (String[] args) {
        System.out.println(toMilesPerHour(10.25));
        printConversion(10.25);
    }

//    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            int inMiles = (int) ( kilometersPerHour*0.62);
            return (long)Math.round(inMiles);

        }
        else {
            return -1;
        }

    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour +" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
    }
}

