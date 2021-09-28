public class Palindrome {
    public static void main (String[] args) {
        System.out.println(isPalindrome(121121));

    }

    public static boolean isPalindrome(int number) { // method to check whether an number is a palindrome or not.
        System.out.println(number);
        int checkNumber = number;
        System.out.println("check number "+checkNumber);
        int reversed = 0;

        while(checkNumber != 0) {

            int digit = checkNumber % 10;
            reversed = reversed * 10 + digit;
            checkNumber /= 10;
        }
        System.out.println(reversed);

        return reversed == number;
    }
}
