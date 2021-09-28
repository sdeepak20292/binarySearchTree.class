import java.util.ArrayList;

public class Recursion {
//    public static void main (String[] args) {
//        bin(8);
//        System.out.println(log2(27));
//        System.out.println(22/7);
////        System.out.println();
//        stars(5);
//        fun3(200);
//        int arr[] = {112, 10, 30, 50, 100};
//        System.out.println(maxInt(arr, 5));

    // post incrementor.
//        int a = 8;
//        System.out.println(a++);
//        System.out.println();
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);

//        System.out.println(fun4(100));
//        System.out.println(bunnyEars(7));
//
//    }

    public static int linearSeach(int[] array, int n, int h) { // will return the index of first occurence of n.
//        for(int i = 0; i < array.length; i ++ ) {
//            if(array[i] == n){
//                return i;
//            }
//        }
//        return -1; // if not found.
//    }
        // using recursion.
        if (h < 0) {
            return -1;
        }


        return linearSeach(array, n, h - 1);

    }


    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return pow(a, n / 2) * pow(a, n / 2);
        } else {
            return a * pow(a, n / 2) * pow(a, n / 2);
        }
    }

    public static int fun(int x, int y) { // this function will return sum of n terms from 1 to x + y;
        if (x == 1) {
            return y;
        }
        return fun(x - 1, y + x);
    }

    // SELECTION SORT - METHOD IN WHICH ARRAY IS SORTED (ASCENDING ORDER) BY FINDING MINIMUM ELEMENT AND SWAPPING.

    public static int[] selectionSort(int[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            int temp;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;

        // using recursion.


    }

    public static void bin(int n) { // method to print binary equilvalent.
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n % 2);
        bin(n / 2);
    }

    public static double log2(double n) {
        if ((n == 1) || (n < 1)) {
            return 0;
        }
        return (double) 1 + log2((double) n / 2);
    }

    public static void stars(int n) { // will print n(n+1)/2 start.
        {
            int i = 0;
            if (n > 1)
                stars(n - 1);
            for (i = 0; i < n; i++)
                System.out.print(" * ");
        }
    }

    public static void fun3(int n) {  // will print n ,2n, 4n ... till limit and them print in reverse order
        int LIMIT = 1000;
        if ((n > LIMIT) || (n < 0)) {
            return;
        }
        System.out.println(n);
        fun3(2 * n);
        System.out.println(n);
    }

    // maximun integer in an array;

    public static int maxInt(int[] a, int n) {
        {
            int x;
            if (n == 1) {
                return a[0];
            } else {
                x = maxInt(a, n - 1);
            }
            return Math.max(x, a[n - 1]);  // returns max value.
        }

    }

    public static int fun4(int n) {
        if (n % 2 == 1) {
            return (n++);
        }
        return fun4(n - 1);
    }

    // logic of this function is that, if n is even then return n - 1. else return n.

    public static int add(int a, int b) { // this funtion return a*b;
        {
            if (b == 0)
                return 0;
            if (b % 2 == 0)
                return add(a + a, b / 2);
            int sum = add(a + a, b / 2) + a;

            return sum;
        }
    }

    public static String niceStrings(String a, int n) {
        ArrayList<Character> stringArray = new ArrayList<Character>();
        for (int i = 0; i < n; i++) {
            stringArray.add(a.charAt(i));
        }
        String niceString = "";
        for (int j = 0; j < n; j++) {
            if (!niceString.contains(String.valueOf(stringArray.get(j)))) {
                niceString += String.valueOf(stringArray.get(j));

            }
        }
        return niceString;
    }

    // PRACRISE QUESTION ON RECURSION.

    public static int bunnyEars(int n) {
        if (n == 1) {
            return 2;
        }
        if (n % 2 == 0) {
            return bunnyEars(n - 1) + 3;
        }
        return bunnyEars(n - 1) + 2;
    }

    public static int reverse(int x) {
        long reversed = 0L;


        while((x) !=0){

            int remainder = x % 10;
            x = x / 10;

            reversed = reversed*10 + remainder;

        }
        if(reversed > Integer.MAX_VALUE){
            return 0;
        }
        if(reversed < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reversed;


    }
    public static int reversed(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }






    public static void main(String[] args) {
//        System.out.println(reverse(998, 2));

        System.out.println();
        System.out.println(reverse(98));
        System.out.println(reverse(-987));
        System.out.println(reverse(-880567));
        System.out.println(reverse(1563847412));
        System.out.println(Integer.MAX_VALUE + 7);
        System.out.println(reversed(1563847412));
        System.out.println();
        System.out.println(reverse(-678));


    }





}
