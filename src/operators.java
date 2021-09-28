public class operators {

    public static void main (String[] args) {
        // operators
        // +, -, *, /, %
        int result = 3*4;
        System.out.println(result);
        result = result + 90;
        System.out.println("New result is "+result);
        result = result / 4;
        System.out.println("New result is "+result);
        result = result % 4;  // remainder as same in python.
        System.out.println(result);

        // we can also use abbreviation as same in python.

        result += 10;
        System.out.println(result);

        // if then condtional statements in java is pretty same as in python.

        boolean isAlien = false;
        if (isAlien == false)   // checking whether it is an alien or not.
            System.out.println("It is not an alien");
            // don't place semi colon after if statements as it ends the command, we need to continue it.
        // it is better to write in code block for multiple commands associated with single statements.

        if (isAlien == true) {  // checking whether it is an alien or not.
            System.out.println("It is not an alien");
            System.out.println("I have a freind which looks like alien");
        }

        // AND OPERATOR TO CHECK CONDITIONS

        int highest_marks = 100;
        int my_score = 75;
        if (33 < my_score && my_score < highest_marks) {
            System.out.println("Iam passes");
            System.out.println("Thank god");
            // && is and operator in java amd || is or operator in java.
        }
        if (my_score > highest_marks || my_score > 33) {
            System.out.println("Either topped or passes");
        }

    }
}
