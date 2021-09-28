import java.util.Scanner;

public class minAndMaxValue {
    public static void main (String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number > minValue) {
                    minValue = number;
                }
                if (number < maxValue) {
                    maxValue = number;
                }
            }
            else {
                System.out.println("Invalid input");
                System.out.println("Min is "+maxValue+" Max is "+minValue);
                break;
            }

        }
    }
}
