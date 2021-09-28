public class switchSTATEMENT {
    public static void main (String[] args) {
        // switch statement is used to compare expressions.
        int switchSTATEMENT = 2;

        switch (switchSTATEMENT) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            default:  // defulalt is executed if no cases match the expression.
                System.out.println("Value is not found ");
                break;
        }
        char compare = 'E';

        switch (compare) {
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value is "+compare);
                break;
            default:
                System.out.println("Value not found");
                break;
        }
        String month = "JANUARY";
        switch (month.toLowerCase()) {  // toLowerCase() method of class string converts string to lower case letters.
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("June");
                break;
            case "september":
                System.out.println("Sept");
                break;
            default:
                System.out.println("Not found");

        }
        weekday(6);



    }
    public static void weekday(int Day) { // method to compare weekday
        switch (Day) {
            case 0:
                System.out.println("Sunday");
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Thursday");
                break;

            case 4:
                System.out.println("Friday");
                break;

            case 5:
                System.out.println("Saturday");
                break;

            case 6:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid entry");
        }

    }
}
