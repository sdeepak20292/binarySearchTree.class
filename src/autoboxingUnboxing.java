import java.util.ArrayList;

public class autoboxingUnboxing {
    public static void main (String[] args) {
        Integer myint = 5;

        // converting an primitive value to an object of it's wrapper class == autoboxing.
        System.out.println(Integer.valueOf(6));
        String strInt = myint.toString();
        System.out.println("strInt = "+strInt);
        int newint = myint;  // converting an wrapper object to it's primitive type == unboxing.
        System.out.println( "myint = "+myint);
        System.out.println("newint = "+newint);

        // autoboxing of char.

        Character newChar = 'a';  // autoboxing
        System.out.println("newChar ="+newChar);
        char b = newChar; // unboxing.
        System.out.println("b = "+b);

        //
        System.out.println();
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i += 1) {
//            intArrayList.add(Integer.valueOf(i));
            intArrayList.add(i);  // adding values of i in the arrayList.

        }
        System.out.println(intArrayList);

        System.out.println();

        ArrayList<Double> mydblValue = new ArrayList<Double>();
        for (double i = 0.1; i < 11; i += 1) {
            mydblValue.add(i);
        }

        System.out.println("dblvalye = "+mydblValue);

    }
}
