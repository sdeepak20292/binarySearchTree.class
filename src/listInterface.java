import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listInterface {
    public static void main(String[] args) {
        // we will learn how to make list.

        // list using array list.
        List<String> list = new ArrayList<String>();
        list.add("deepak");
        list.add("raj");
        list.add("harsh");
        list.add("rohit");
        System.out.println(list);

        // enhanced for loop:

        for(String name:list){  // will iterate over a list/ array/ arrayList one by one in forward direction.
            System.out.println(name);
        }

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(2);
        intList.add(4);
        System.out.println();
        System.out.println(intList);
        System.out.println();

        // list making using linkedList:

        List<Integer> newList = new LinkedList<Integer>();
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(9);
        System.out.println(newList);

        // THERE ARE ALSO MANY METHODS TO MANIPULATE A LIST.

        newList.set(0, 10);
        System.out.println(newList.get(0));
        System.out.println();
        System.out.println((int)Math.pow(10, 9)*9);
        System.out.println((int)Math.pow(10, 9)*9>Integer.MAX_VALUE);
        System.out.println();
        System.out.println(9*(int)Math.pow(10, 9));
    }

}
