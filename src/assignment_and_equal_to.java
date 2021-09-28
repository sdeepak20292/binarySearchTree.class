public class assignment_and_equal_to {
    public static void main (String[] args) {
        int value = 50;         // item assignment

        if (value == 50) {    // checking if equal to.
            System.out.println("It is true");
        }

        boolean condition = false;
        if (condition) {   // condition is true
            System.out.println("condition is true");
        }
        if (!condition) {  // condition is false. (! is logical complement operator.)
            System.out.println("condition is false");
        }

        // TERNARY OPERATOR.
        boolean isCar = true;
        boolean wasCar = (isCar = true) ? true : false;
        if (wasCar) {
            System.out.println("wascar is true");
        }

        int is18 = 18;
        boolean age = (is18 == 18) ? true : false;
        if (age) {
            System.out.println("age 18 is "+age);
        }

    }
}
