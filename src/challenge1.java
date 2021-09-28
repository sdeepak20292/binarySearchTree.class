import java.util.Arrays;
import java.util.Scanner;

public class challenge1 {
    public static int makeArray(int count) {
        int[] array = new int[count];  // declaring an array.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers one by one: ");
        for(int i = 0; i < count; i += 1) {
            array[i] = scanner.nextInt();  // taking values from the user (count) times
        }
        System.out.println(Arrays.toString(array));

        return findMinimun(array);
    }

    public static int findMinimun(int[] array) { // this fn will find the min of the numbers in a array.
        int minimun = Integer.MAX_VALUE;
        for ( int i = 0; i < array.length; i += 1) {
            if( array[i] < minimun ){
                minimun = array[i];
            }
        }
        reverseIt(array);
        return minimun;
    }

    public static void main (String[] args) {
//        System.out.println(makeArray(5));
//        System.out.println(isPalindrome("deed"));
        int a = 1 & 4;
        System.out.println(a);
        int b = 4 ^ 5;
        System.out.println(b);



    }

    public static void reverseIt(int[] array) {  // fn to reverse contents of an array.
        int[] reverseArray = new int[array.length];
        for( int i = array.length - 1; i >= 0; i -= 1) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Original array is "+Arrays.toString(array));
        System.out.println("Reversed array is "+Arrays.toString(reverseArray));
    }

    public static boolean isPalindrome(String s) {
        boolean flag = true;
//        System.out.println(Math.ceil((double)s.length()/2));

        for(int i = 1; i < Math.ceil((double)s.length()/2); i += 1) {
            flag = s.charAt(i) == s.charAt(s.length() - 1 - i);
        }

        return flag;
    }

}
