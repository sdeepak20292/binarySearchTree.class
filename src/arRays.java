import java.util.Arrays;

public class arRays {
    public static void main (String[] args) {
        int[] myIntArray = new int[10];  // making an array for stroring ints, with 10 slots.
        myIntArray[0] = 45;  // means 45 at 0 index.
        myIntArray[2] = 10; // means 10 at 2 index.
        System.out.println(Arrays.toString(myIntArray));

        double[] myDoubleArray = new double[3]; // making an new array to store double data type with 5 slots.
        myDoubleArray[0] = 0;
        myDoubleArray[1] = 1;
        myDoubleArray[2] = 2;
        System.out.println(Arrays.toString(myDoubleArray));  // priting the array as string in the console.

        int[] mySecondArray = {1,2,3,4,5,6};  // another way of making an arrya of int with 6 slots and providing values
        System.out.println(Arrays.toString(mySecondArray));

        // indexing arrays.

        System.out.println(mySecondArray[0]);
        System.out.println(mySecondArray[3]);

        //
        System.out.println();
        int[] myThirdArray = new int[10];

        for(int i = 0; i < myThirdArray.length; i +=1) {
            myThirdArray[i] = i * 10;
            System.out.println("Index "+i+" has value "+myThirdArray[i]);
        }
        System.out.println();

        int[] mylast = new int[10];
        makeArray(mylast);

    }

    public static void makeArray(int[] Array) { // method to make an array.
        // Here array is a parameter and int[] means array to store ints.
        for (int i = 0; i < Array.length; i += 1) {
            Array[i] = (i + 1) * 10;
            System.out.println(i+1+" = "+Array[i]);
        }
    }

    public static void reverse(int[] array) {
        System.out.println("Array = "+Arrays.toString(array));
        for(int i = 0; i < array.length; i ++ ) {
            array[i] = array.length - 1 - i;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));
    }

}
