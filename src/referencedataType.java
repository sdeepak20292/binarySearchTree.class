import java.util.Arrays;

public class referencedataType {
    public static void main (String[] args) {
        int value = 10; // this is a primitive data type.
        int anotherValue = value;
        System.out.println("value "+value);
        System.out.println("anotherValue "+anotherValue);
        System.out.println();
        anotherValue += 5;
        System.out.println("value "+value);
        System.out.println("anotherValue "+anotherValue);
        // above two variables have different identities so changing one doesnot changes another.

        // but for array, these are reference type.

        int[] myArray = new int[5];
        int[] newArray = myArray;
        System.out.println("myArray "+myArray);  // myArray and newArray are memory addreses for the object of class int[]
        System.out.println("newArray "+newArray);
        System.out.println("myArray "+ Arrays.toString(myArray));
        System.out.println("newArray "+Arrays.toString(newArray));
        System.out.println();
        newArray[2] = 5;
        System.out.println("myArray "+myArray);
        System.out.println("newArray "+newArray);
        System.out.println();

        System.out.println("myArray "+ Arrays.toString(myArray));
        System.out.println("newArray "+Arrays.toString(newArray));

        newArray = new int[]{0, 1, 2, 3, 4}; // allocating a new memory reference to newArray.
        System.out.println("myArray "+ Arrays.toString(myArray));
        System.out.println("newArray "+Arrays.toString(newArray));

        System.out.println("myArray "+ (myArray));
        System.out.println("newArray "+(newArray));

        // the memory addresses for the two array have been changed so changing one doesnot affects another.


        // changing one array also changes another as they both haves same memory reference. that is [I@3498ed..


    }
}
