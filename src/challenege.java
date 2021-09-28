import java.util.Arrays;
import java.util.Scanner;


public class challenege {

//    public static void main (String[] args) {
//////        int[] myarray = getIntegers(5);
//////        System.out.println(Arrays.toString(myarray));
//////
//////        System.out.println(Arrays.toString(sort(myarray)));
//        System.out.println();
////
////
////    }
//
//    public static int[] getInegers(int n) {
//        Scanner sc = new Scanner(System.in);
//        int[] returnedArray = new int[n];
//        for(int i = 0; i < n; i +=1 ) {
//            returnedArray[i] = sc.nextInt();
//        }
//        return returnedArray;
//    }
//
//    public static void printArray(int[] array) {
//        for(int i = 0; i < array.length; i ++ ) {
//            System.out.println("Element "+i+" contents "+array[i]);
//        }
//
//    }
//
//    public static int[] sortIntegers(int[] array) {
//        boolean flag = true;
//        while(flag) {
//            flag = false;
//            for(int i = 0 ; i < array.length - 1; i ++) {
//                int temp;
//                if(array[i] < array[i + 1]){
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        return array;
//    }

    public static int readInteger() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        return n;
    }

    public static int[] readElements(int n) {
        Scanner sc = new Scanner(System.in);

        int[] myarray = new int[n];
        for(int i = 0; i < n; i ++ ) {
            myarray[i] = sc.nextInt();
        }
        return myarray;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i += 1 ) {
            if (array[i] < minValue){

                minValue = array[i];
            }
        }
        return minValue;
    }
    public static void main (String[] args) {
        int[] newa = new int[5];
        newa = new int[]{1, 4, 3, 4, 5};
//        System.out.println(findMin(newa));
//        reverse(newa);
        System.out.println(Math.floor(2.0));
        System.out.println(pow(5,3));
        System.out.println();
        System.out.println(nFib(5));
        System.out.println();
        System.out.println(linearSeach(newa, -3, newa.length - 1));
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        System.out.println("Array = "+ Arrays.toString(array));
        for(int i = 0; i < array.length; i += 1 ) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed array = "+Arrays.toString(reversedArray));
    }

    public static int pow(int a, int n) {
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return pow(a, n/2)*pow(a, n/2);
        }
        else{
            return a*pow(a, n/2)*pow(a, n/2);
        }
    }

    public static int nFib(int n) {
        if(n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return nFib(n - 1) + nFib(n - 2);
    }

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

        if (array[h] == n) {
            return h;
        }

        return linearSeach(array, n, h - 1);

//
    }
    public static void stars(int n) {
        {
            int i = 0;
            if (n > 1)
                stars(n - 1);
            for (i = 0; i < n; i++)
                System.out.print(" * ");
        }
    }

}
