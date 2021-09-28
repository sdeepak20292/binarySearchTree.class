import java.util.Arrays;
import java.util.Scanner;

public class arrayMaker {

    public static void main (String[] args) {
        System.out.println(Arrays.toString(makeArray(5)));
    }

    public static int[] makeArray(int number) {
        Scanner scanner = new Scanner(System.in); // declaring scanner as object of Scanner.

        System.out.println("enter "+ number + " numbers one by one");
        int[] array = new int[number];
        // declaring an array.

        double average = 0;
        for (int i = 0; i < number; i += 1) {
            array[i] = scanner.nextInt(); // taking inputs withing loops and storing values to the array.
            average += array[i];
        }
        System.out.println("Average of the numbers are: "+Math.round(average/array.length*100)/100);

//        Arrays.sort(array); // method to sort array.
        int[] sortedArray = new int[array.length];

        // our method to sort an list.
        boolean flag = true;
        int temp = 0;

        while (flag) {
            flag = false;  // if the below loop doesnot execute then the loop will end as it will read flag as false.

            for (int i = 0; i < array.length - 1; i += 1) { // method to sort an array in descending order.
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
