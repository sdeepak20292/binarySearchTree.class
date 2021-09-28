import java.util.Scanner;

public class sCanner {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();   // taking an string value from user and storing it to name
        System.out.println("enter your age");
        boolean hasNextint = scanner.hasNextInt();  // this checks whether the next input entered is a int or not.

        if (hasNextint) {
            int age = scanner.nextInt();

            System.out.println("enter a decimal number");
            double decimal = scanner.nextDouble();  // taking an double value from user and storing it to variable decimal.
            System.out.println(decimal);

            System.out.println("Your name is :"+name);
            System.out.println("Your age is: "+age);
            scanner.close();

        }
        else {
            System.out.println("Invalid input");
        }

    }
}
