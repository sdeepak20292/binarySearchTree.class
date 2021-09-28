import java.util.Scanner;

public class readingUserInputChallenge {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (true) {
            System.out.println("enter number #" + (count));
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count += 1;
                if (count > 10) {
                    System.out.println("sum is "+sum);
                    break;
                }
            }

            else {
                System.out.println("Invalid input");

            }
            scanner.nextLine(); // this method returns the input that was skipped.
        }
        scanner.close();

    }
}
