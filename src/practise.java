import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
//        Integer n = sc.nextInt();
//        ArrayList<String> l;
//        for(int i = n.toString().length() - 1; i >= 0  ; i += 1) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a digit");
//        int digit = sc.nextInt();
//        int year = sc.nextInt();
//        System.out.println(checkLeapYear(year));
//        System.out.println(dayInMonth(12, 2018));
//        System.out.println(sumOdd(100, 1000));
//        System.out.println("enter the number: ");
//        int n = sc.nextInt();
//        System.out.println(digitSum(n));
//        System.out.println(numberPalindrome(11212));
//        System.out.println(fistLastSum(0));
//        System.out.println(EvendigitSum(-1));
//        System.out.println(getSharedDigt(15, 6));
//        System.out.println(hasSameLastDigit(41, 22, 71));
//        System.out.println(getGreatestDivisor(9, 18));
        System.out.println(getLargestPrime(217));


    }

    public static boolean checkLeapYear(int year) {  // method to chech whether a year is leap year.
        if ((year >= 1) && (year <= 9999)) {
            if (year % 4 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return year % 100 != 0;
            }
        }
        return false;
    }

    public static int dayInMonth(int month, int year) { // method to check days in a month
        int p;
        if ((month >= 1) && (month <= 13)) {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    if (checkLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }

        }
        return -1;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i += 1) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;

    }

    public static int digitSum(int number) {
        int sum = 0;
        String numToStr = String.valueOf(number); // converrting int number to String number.
        if (number >= 10) {
            for (int i = 0; i < numToStr.length(); i += 1) {
                sum += Character.getNumericValue(numToStr.charAt(i)); // converting char to int.
            }
            return sum;
        }
        return -1;
    }

    public static boolean numberPalindrome(int number) {
        String numToStr = String.valueOf(number); // main number String
        String reversedNumber = ""; // declarting an empty string.
        if (number > 0) {
            for (int i = numToStr.length() - 1; i >= 0; i -= 1) { // backward iteration.
                reversedNumber += numToStr.charAt(i);
            }
            System.out.println(reversedNumber);
            return reversedNumber.equals(numToStr); // .equals() compares one string to another and return boolean.
        }
        return false;
    }

    public static int fistLastSum(int number) {
        String numToStr = String.valueOf(number);
        int sum;
        if ( number > 0){
            sum = Character.getNumericValue(numToStr.charAt(0)) + Character.getNumericValue(numToStr.charAt(numToStr.length() - 1));
            return sum;

        }
        return -1;
    }

    public static int EvendigitSum(int number) {
        if (number > 0 ) {
            int sum = 0;
            int evenDigit;
            String numToStr = String.valueOf(number);
            for (int i = 0; i < numToStr.length(); i += 1) {
                evenDigit = Character.getNumericValue(numToStr.charAt(i));
                if (evenDigit % 2 == 0) {
                    sum += evenDigit;
                }
            }
            return sum;
        }
        return -1;
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10) && (number1 <= 99) && (number2 >= 10) && (number2 <= 99)) {
            String strNum1 = String.valueOf(number1);
            String strNum2 = String.valueOf(number2);
            for (int i = 0; i < strNum1.length(); i += 1) {
                char digit1 = (strNum1.charAt(i));
                for (int j = 0; j < strNum2.length(); j += 1) {
                    char digit2 = (strNum2.charAt(j));
                    if (digit1 == digit2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (isValid(n1) && isValid(n2) && isValid(n3)) {
            if (String.valueOf(n1).charAt(String.valueOf(n1).length() - 1) ==
                    String.valueOf(n2).charAt(String.valueOf(n2).length() - 1)) {
                return true;
            }
            if (String.valueOf(n1).charAt(String.valueOf(n1).length() - 1) ==
                    String.valueOf(n3).charAt(String.valueOf(n3).length() - 1)) {
                return true;
            }
            return String.valueOf(n3).charAt(String.valueOf(n3).length() - 1) ==
                    String.valueOf(n2).charAt(String.valueOf(n2).length() - 1);
        }
        return false;



    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }

    public static int getGreatestCommonDivisor(int n1, int n2) {
        int greatesDivisor = -1;
        int divisor1;
        int divisor2;
        if ((n1 >= 10) && (n2 >= 10)) {
            for (int i = 1; i <= n1; i += 1) {
                if ( n1 % i == 0) {
                    divisor1 = i;
                    for (int j = 1; j <= n2; j += 1) {
                        if (n2 % j == 0) {
                            divisor2 = j;
                            if (divisor1 == divisor2) {
                                if (divisor1 > greatesDivisor) {
                                    greatesDivisor = divisor1;
                                }
                            }
                        }
                    }
                }
            }
        }

        return greatesDivisor;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount >=0) && ( smallCount >= 0) && (goal >= 0)) {
            double Dfactor = Math.floor((double)goal/ 5);
            int factor = (int)Dfactor;
            if (bigCount < factor) {
                return bigCount * 5 + smallCount >= goal;
            }
            else if ( bigCount == factor) {
                return bigCount * 5 + smallCount >= goal;
            }
            else {
                return factor * 5 + smallCount >= goal;
            }
        }
        return false;
    }

    public static boolean primeCheck(int number) {
        for (int i = 2; i < number; i +=1 ) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int number ) {
        int greatest = 0;
        int factor;
        boolean isPrime = true;
        if (number >= 2){
            for (int i = 1; i <= number; i +=1) {
                if (number % i == 0){
                    factor = i;
                    for (int j = 2; j < factor; j += 1) {
                        if (factor % j == 0){
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime){
                        if (factor > greatest) {
                            greatest = factor;
                        }
                    }
                }

            }
            return greatest;
        }
        return -1;

    }
}
