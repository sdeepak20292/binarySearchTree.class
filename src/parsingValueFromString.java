public class parsingValueFromString {
    public static void main (String[] args) {
        String num = "2019";
        int number = Integer.parseInt(num); // converting string to int, using Integer class and parseInt() method of it's
        System.out.println(number);
        System.out.println(num);
        System.out.println(); // blank space.

        double num2 = Double.parseDouble(num); // converting string to double using Double class.
        System.out.println(num2);
    }
}
