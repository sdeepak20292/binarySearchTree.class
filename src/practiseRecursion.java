import java.util.Arrays;

public class practiseRecursion {

    public static void main (String[] args) {
        System.out.println(countSeven(777007));
        forwardOrder("deepak", 5);
        System.out.println();
        reverseOrder("deepak", 0);
        System.out.println();
        System.out.println(palindrome("racecarr", 0, 7));
        int[] array = new int[]{-5, -6, -10, 7, 1, 2, 3, 4, 5};
        System.out.println(linearSearch(array, 0, 7, 6));
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println();
        System.out.println(binarySearch(array2, 0, 7, 1));
        System.out.println(minimumElement(array, array.length - 1));
        System.out.println(minimumIndex(array, 0, array.length - 1));
        System.out.println();
        selectionSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
        System.out.println();
        DescendingOrderSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
        System.out.println();
        normalSelSort(array);
        System.out.println(Arrays.toString(array));
    }

    // PRACRISE QUESTION ON RECURSION.

    public static int bunnyEars(int n) {
        if(n ==1) {
            return 2;
        }
        if(n%2 == 0){
            return bunnyEars(n - 1) + 3;
        }
        return bunnyEars(n - 1) + 2;
    }

    public static int sumOfDigits(int n) {  // will count sum of digits of an number.
        if(n == 0) {
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }

    public static int countSeven(int n) {  // count seven in an number.
        int x;
        if(n == 0) {
            return 0;
        }
        x =  countSeven(n/10);
        if(n % 10 == 7) {
            x += 1;
        }
        return x;
    }

    public static void forwardOrder(String word, int n) {  // prints the letters of string in order.
        String x;
        if(n < 0) {
            return;
        }
        forwardOrder(word, n - 1);
        System.out.print(word.charAt(n));
    }

    public static void reverseOrder(String word, int b) {  // prints the letter of string in reverse order.
        if(b == word.length()){
            return;
        }

        reverseOrder(word, b + 1);
        System.out.print(word.charAt(b));
    }

    public static boolean palindrome(String word, int s, int e) {  // recursive funtion to check palindrome.
        if(s == e){
            return true;
        }
        if(word.charAt(s) != word.charAt(e)){
            return false;
        }
        if(s < e ){
            return palindrome(word, s + 1, e - 1);

        }
        return true;

    }

    public static int linearSearch(int[] array, int s, int e, int x) { // to search an element from an array.
        if((e < s ) || ( s > array.length - 1)){
            return -1;
        }
        if(array[s] == x) {
            return s;
        }
        if(array[e] == x){
            return e;
        }
        return linearSearch(array, s + 1, e - 1, x);
    }

    public static int binarySearch(int [] sortedArray, int s, int e, int f) {
        if(e >= s) {
            int mid = s + (e - s)/2;
            if(sortedArray[mid] == f) {
                return mid;
            }
            if(sortedArray[mid] < f) {
                return binarySearch(sortedArray, mid + 1, e, f);
            }
            else{
                return binarySearch(sortedArray, s, mid - 1, f);
            }
        }
        return -1;
    }

    public static int minimumElement(int[] array, int n) { // will return minimum element in an array.
        if (n == 1) {
            return array[0];
        }
        int k =  minimumElement(array, n - 1);
        return Math.min(k, array[n]);
    }

    public static int minimumIndex(int[] array, int s, int e) { // this funtion will give the minimum index in an array.
        if(s == e){
            return s;
        }
        int k = minimumIndex(array, s + 1, e);

        return array[k] < array[s]?k:s;
    }

    public static void selectionSort(int[] array, int index, int n) { // this algo wiil sort an array(ascending order).
        if(index == n){
            return;
        }

        int k = minimumIndex(array, index, n - 1);

        if(index != k) {
            int temp = array[index];
            array[index] = array[k];
            array[k] = temp;
        }
        selectionSort(array, index + 1, n);
    }

    public static int maxIndex(int[] array, int s, int e) { // will find maxIndex from an array.
        if(s == e) {
            return s;
        }

        int k = maxIndex(array, s + 1, e);
        return array[k] > array[s] ? k:s;
    }

    public static void DescendingOrderSort(int[] array, int index, int n) {
        if(index == n){
            return;
        }
        int k = maxIndex(array, index, n - 1);
        if(k != index){
            int temp = array[index];
            array[index] = array[k];
            array[k] = temp;
        }
        DescendingOrderSort(array, index + 1, n);
        // this function will sort my array in descending order.
    }

    public static void normalSelSort(int [] array) { // in ascending order.
        for(int i = 0; i < array.length; i ++) {
            for(int j = i + 1; j < array.length; j ++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
