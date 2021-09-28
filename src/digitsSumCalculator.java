public class digitsSumCalculator {
    public static void main (String[] args) {
        // main code here.
        System.out.println(digitSumCalculator(999999999));
    }

    public static int digitSumCalculator(int number) {   // method to calculate sum of digits of a number.
        String num = Integer.toString(number); // converting int to string.
        int length = num.length();  // length of the string.
        int start = 0;
        int sum = 0;
        while (start < length) {
            char n = num.charAt(start);
            int s = Character.getNumericValue(n); // converting char to int
            sum += s;
            start += 1;
        }
        return sum;

    }
}
