public class secondsANDMINUTES {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";
    // Raising error in java.


    public static void main(String[] args) {
        System.out.println(minutesANDSECONDS(2, 20));
        System.out.println(minutesANDSECONDS(-1));
        System.out.println(minutesANDSECONDS(65, 9));
    }

    // to calculate duration string
    public static String minutesANDSECONDS(int minutes, int seconds) {
        int totalSECONDS = minutes * 60 + seconds;
        int hours = (int) (totalSECONDS / 3600);
        int minute = (int) ((totalSECONDS - (hours * 3600)) / 60);
        if ((minutes >= 0) && (seconds >= 0) && (seconds < 59)) {
            String hourSTRING = hours + "h";
            String minuteSTRING = minute + "m";
            String secondSTRING = seconds + "s";
            if (hours < 10) {
                hourSTRING  = "0" + hourSTRING;

            }
            if (minute < 10) {
                minuteSTRING = "0" + minuteSTRING;
            }

            if (seconds < 10) {
                secondSTRING = "0" + secondSTRING;
            }
            return hourSTRING + " " + minuteSTRING + " " + secondSTRING;

        }
        else

        {
            return INVALID_VALUE_MESSAGE;
        }

    }


    public static String minutesANDSECONDS(int seconds) {
        int minutes = (int) (seconds / 60);
        int second = (int) (seconds - (minutes * 60));

        return minutesANDSECONDS(minutes, second); // calling the above function.

    }





}
